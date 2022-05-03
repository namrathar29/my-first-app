package com.example.bankingapp.serviceimpl;

import com.example.bankingapp.dto.BaseResponse;
import com.example.bankingapp.dto.CartDetailsRequest;
import com.example.bankingapp.dto.ProductDetailsRequest;
import com.example.bankingapp.entity.Carts;
import com.example.bankingapp.entity.Products;
import com.example.bankingapp.repository.CartsDAO;
import com.example.bankingapp.repository.ProductsDAO;
import com.example.bankingapp.service.CartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartsServiceImpl implements CartsService {

    @Autowired CartsDAO cartsDAO;

    @Autowired ProductsDAO productsDAO;

    @Override
    public ResponseEntity<BaseResponse> fillCartWithProducts(CartDetailsRequest cartDetailsRequest) {

        Carts carts = new Carts();
        carts.setCartPlatform(cartDetailsRequest.getCartPlatform());
        cartsDAO.save(carts);

        List<ProductDetailsRequest> productDetailsRequestList = cartDetailsRequest.getProductDetailsRequestList();

        for (ProductDetailsRequest productDetailsRequest: productDetailsRequestList){

            Products products = new Products();
            products.setProductName(productDetailsRequest.getProductName());
            products.setProductPrice(productDetailsRequest.getProductPrice());
            products.setProductQuantity(productDetailsRequest.getProductQuantity());
            products.setCarts(carts);
            productsDAO.save(products);
        }

        BaseResponse baseResponse = new BaseResponse();

        baseResponse.setMessage("Cart Saved!!!");
        baseResponse.setHttpStatus(HttpStatus.CREATED);
        baseResponse.setHttpStatusCode(HttpStatus.CREATED.value());
        baseResponse.setResponse(cartDetailsRequest);
        return new ResponseEntity<BaseResponse>(baseResponse, HttpStatus.CREATED);
    }
}
