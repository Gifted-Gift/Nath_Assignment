package com.example.demo;

import com.example.demo.NameRequest;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greet(NameRequest nameRequest) {
        String name = nameRequest.getName().trim().replaceAll("\\s+", " ");

        if (name.isEmpty()) {
            return "Kindly enter a valid name";
        }

        return "Hello " + name;
    }
}
