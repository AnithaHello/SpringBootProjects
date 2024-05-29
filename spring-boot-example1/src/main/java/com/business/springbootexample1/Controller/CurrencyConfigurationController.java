package com.business.springbootexample1.Controller;

import com.business.springbootexample1.configuration.CurrencyServiceConfiguration;
import com.business.springbootexample1.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController // used to build the Rest API
public class CurrencyConfigurationController {

    @Autowired
    private CurrencyServiceConfiguration currencyServiceConfiguration;

 //We want to get an instance of the CurrencyServiceConfiguration created by Spring
    // Since we used @Component annotation of CurrencyServiceConfiguration, springboot will create the instance of it.
    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration retrieveAllCourses (){

        return currencyServiceConfiguration;
    }
}
