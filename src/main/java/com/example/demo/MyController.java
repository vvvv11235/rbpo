package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    // Первый эндпоинт - возвращает текст
    @GetMapping("/hello")   // URL будет: http://localhost:8080/hello
    public String sayHello() {
        return "Привет! Это первый эндпоинт, возвращающий текст.";
    }

    // Второй эндпоинт - возвращает числа
    @GetMapping("/number")  // URL будет: http://localhost:8080/number
    public int getNumber() {
        return 42;
    }
}