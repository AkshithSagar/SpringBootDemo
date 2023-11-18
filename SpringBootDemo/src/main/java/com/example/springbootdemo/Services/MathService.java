package com.example.springbootdemo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class MathService {
    @Autowired
    DataService ds;

    MathService(DataService ds){
        ds=this.ds;
    }
    public void getEvenSum(){
        Flux<Integer> numbers=ds.getMathFlux();
        numbers.doOnNext(System.out::println).subscribe();
    return;
    }
}
