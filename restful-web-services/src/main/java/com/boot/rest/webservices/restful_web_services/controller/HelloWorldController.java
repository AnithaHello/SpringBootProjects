package com.boot.rest.webservices.restful_web_services.controller;

import com.boot.rest.webservices.restful_web_services.bean.helloworldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    //Step 1: This controller would expose Rest API
    //Step 2: Give Specific url to the Rest API

    //@RequestMapping("/helloworld")
    @GetMapping(path="/helloworld")
    public String helloworld(){
        return "Hello world";
    }

    @GetMapping(path="/helloworldBean")
    public helloworldBean helloworldBean(){
        return new helloworldBean("Hello Anitha");
    }

    //Build a simple url accepting the path parameters
    // /helloworld/path-variable/{name}

    @GetMapping(path="/helloworld/path-variable/{name}")
    public helloworldBean helloworldPathVariable(@PathVariable String name){
        return new helloworldBean(String.format("Testing Path Variable %s " , name));
    }



}
