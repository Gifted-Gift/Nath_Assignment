package com.example.demo;
import com.example.demo.NameRequest;
import com.example.demo.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GreetingController {
    @Autowired
    private GreetingService greetingService;

    @PostMapping("/greet")
    public String greet(@RequestBody NameRequest nameRequest) {
        return greetingService.greet(nameRequest);
    }
}
