package com.example.bankingapp.serviceimpl;

import com.example.bankingapp.dto.MetroCardUserDetailsRequest;
import com.example.bankingapp.entity.User;
import com.example.bankingapp.repository.UserDAO;
import com.example.bankingapp.service.MetroCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MetroCardServiceImpl implements MetroCardService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public String registerUser(MetroCardUserDetailsRequest metroCardUserDetailsRequest){
        User user = new User();
        user.setName(metroCardUserDetailsRequest.getName());
        user.setEmailId(metroCardUserDetailsRequest.getEmailId());
        user.setCardType(metroCardUserDetailsRequest.getCardType());

        userDAO.save(user);
        return "User registered successfully";
    }

    @Override
    public MetroCardUserDetailsRequest getUserDetails(int userId){
        Optional<User> users = userDAO.findById(userId);
        MetroCardUserDetailsRequest userDetails = new MetroCardUserDetailsRequest();
        userDetails.setName(users.get().getName());
        userDetails.setEmailId(users.get().getEmailId());
        userDetails.setCardType(users.get().getCardType());
        return userDetails;

    }
}
