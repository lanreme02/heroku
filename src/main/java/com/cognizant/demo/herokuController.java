package com.cognizant.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
final class herokuController {

    @GetMapping("/")
    public Iterable<?> list(){

        return Collections.emptyList();
    }

}
