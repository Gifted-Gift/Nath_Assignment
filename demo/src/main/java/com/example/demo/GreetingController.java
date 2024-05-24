package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @PostMapping("/greet")
    public String greet(@RequestBody NameRequest nameRequest) {
        String name = nameRequest.getName().trim().replaceAll("\\s+", " ");

        if (name.isEmpty()) {
            return "Kindly enter a valid name";
        }

        return "Hello " + name;
    }
}

class NameRequest {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}