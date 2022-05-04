package com.careerdevs.NASAApod2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/nasa")
//https://api.nasa.gov/planetary/apod
public class NasaController {

    @Autowired
    Environment environment;

    private String nasaApodEndpoint = "https://api.nasa.gov/planetary/apod?api_key=";

//    @GetMapping("/apod")
//    public Object apodHandler (RestTemplate restTemplate){
//        return restTemplate.getForObject(nasaApodEndpoint, Object.class);
//    }

    @GetMapping("/params")
    public String test (@RequestParam String name){
        return "Hello " + name;
    }

    @GetMapping("/key")
    public String getKey(){
        return environment.getProperty("myNasaKey");
    }
}
