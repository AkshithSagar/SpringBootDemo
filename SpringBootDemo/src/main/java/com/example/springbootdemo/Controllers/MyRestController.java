package com.example.springbootdemo.Controllers;

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

    @GetMapping("/getNames")
    public static Flux<String> getStrings(){

        Flux<String> values= Flux.just("Luffy","Zoro","sanji","Naruto","Pirate-king" );

        return values;

    }
    @GetMapping("/getNumbers")
    public static Flux<Integer> getNumbers(){
        var numbers=Flux.fromStream(IntStream.rangeClosed(0, 15)
                .boxed()
                .map(x-> {
                            Random r = new Random();
                            int num=r.nextInt(0,15);
                            x=x+num;
                            return x;
                        }
                )
        );
        return numbers;

    }



}
