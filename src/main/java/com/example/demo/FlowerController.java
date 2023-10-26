package com.example.demo;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.item.Flower;

@SpringBootApplication
@RestController
@RequestMapping("/api/flowers")
public class FlowerController {
    @GetMapping("/list")
    // public String miwa(){
    //     return "IA PIDARAS";
    // }
    public List<Flower> flowers() {
        return List.of(new Flower());
    }
    
}
