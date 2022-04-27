package com.example.bankingapp.controller;

import com.example.bankingapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("fetch-product-details/{productName}")
    public String myFirstMethod(@PathVariable String productName){
        switch (productName){
            case "shoes":
                return shoesDetails();
            case "watch":
                return watchDetails();
            default:
                return "No product found";
        }
    }

    private String watchDetails() {
        return "There are any brands of watches which you may like";
    }

    private String shoesDetails() {
        return "Look into the high rated shoes";
    }
    @GetMapping("add-numbers/{number1}/{number2}")
    public int addNumbers(@PathVariable int number1, @PathVariable int number2){
        try{
            return number1+number2;
        }
        catch (NumberFormatException ex){
            throw new NumberFormatException("Numbers and strings cannot be added");
        }
    }


    @Autowired
    private TestService testService;

    @GetMapping("fetch-details/{productType}")
    public String flipCartProductDetails(@PathVariable String productType){
        return testService.fetchProductDetails(productType);
    }
}
