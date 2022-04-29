package com.example.bankingapp.serviceimpl;

import com.example.bankingapp.dto.MetroCardUserDetailsRequest;
import com.example.bankingapp.dto.ReviewUserResponse;
import com.example.bankingapp.entity.User;
import com.example.bankingapp.repository.UserDAO;
import com.example.bankingapp.service.MetroCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MetroCardServiceImpl implements MetroCardService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public String registerUser(MetroCardUserDetailsRequest metroCardUserDetailsRequest) {
        User user = new User();
        user.setName(metroCardUserDetailsRequest.getName());
        user.setEmailId(metroCardUserDetailsRequest.getEmailId());
        user.setCardType(metroCardUserDetailsRequest.getCardType());

        userDAO.save(user);
        return "User registered successfully";
    }

    @Override
    public MetroCardUserDetailsRequest getUserDetails(int userId) {

        MetroCardUserDetailsRequest metroCardUserDetailsRequest = new MetroCardUserDetailsRequest();

        Optional<User> user = userDAO.findById(userId);
        User userDetails = user.get();

        metroCardUserDetailsRequest.setUserId(userDetails.getUserId());
        metroCardUserDetailsRequest.setName(userDetails.getName());
        metroCardUserDetailsRequest.setEmailId(userDetails.getEmailId());
        metroCardUserDetailsRequest.setCardType(userDetails.getCardType());

//        ReviewRequest reviewRequest = new ReviewRequest();
//        reviewRequest.setUserName("joy");
//        reviewRequest.setReview("Service is good");
//        reviewRequest.setRating("4");


        List<ReviewUserResponse> reviewRequestList = new ArrayList<>();

        ReviewUserResponse reviewRequest = new ReviewUserResponse();
        reviewRequest.setUserName("joy");
        reviewRequest.setReview("Service is good");
        reviewRequest.setRating("4");

        ReviewUserResponse reviewRequest1 = new ReviewUserResponse();
        reviewRequest1.setUserName("roy");
        reviewRequest1.setReview("Service could be much more better");
        reviewRequest1.setRating("2.5");

        reviewRequestList.add(reviewRequest);
        reviewRequestList.add(reviewRequest1);

        metroCardUserDetailsRequest.setReviews(reviewRequestList);


        return metroCardUserDetailsRequest;


    }
}
