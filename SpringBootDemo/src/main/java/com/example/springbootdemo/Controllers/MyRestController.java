package com.example.springbootdemo.Controllers;

import com.example.springbootdemo.Services.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@RestController
public class MyRestController {
    @Autowired
    DataService ds;

    @GetMapping("/getNames")
    public  Flux<String> getStrings(){
        Flux<String> values= ds.getStringFlux();
        return values;

    }
    @GetMapping("/getNumbers")
    public  Flux<Integer> getNumbers(){
        Flux<Integer> numbers= ds.getMathFlux();
        return numbers;

    }



}
