
package com.example.restservice;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private GreetingRepository greetingRepository;

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @PostMapping("/greetingData")
     public GreetingData greetingData(@RequestBody GreetingData greetingData){
        return greetingRepository.save(greetingData);
    }

    @GetMapping("/getRecord")
    public List<GreetingData> getGreetingData(){
        return greetingRepository.findAll();
    }
}
