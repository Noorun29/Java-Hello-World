package com.example.helloworld.service;

import com.example.helloworld.entity.Hello;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HelloServiceImpl implements HelloService{

    public String getText() {
        return "Hello world";
    }
}
