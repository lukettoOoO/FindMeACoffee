package com.findmeacoffee;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class HelloController {
    @GetMapping("/hello")
    public Map<String, String> hello() {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("message", "Hello from backend");
        return myMap;
    }
}
