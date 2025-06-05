package com.gtel.srpingtutorial.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noauth")
public class NoAuthControllers {

    //async

    @PostMapping("/async")
    public void demoAsync(

    ){

    }
}
