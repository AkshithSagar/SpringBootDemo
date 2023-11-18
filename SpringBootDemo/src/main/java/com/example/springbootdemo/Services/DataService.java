package com.example.springbootdemo.Services;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Random;
import java.util.stream.IntStream;
@Service
public class DataService {

    public Flux<String> getStringFlux(){
        Flux<String> values= Flux.just("Luffy","Zoro","sanji","Naruto","Pirate-king" );
        return values;
    }
    public Flux<Integer> getMathFlux(){
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
        return  numbers;
    }


}
