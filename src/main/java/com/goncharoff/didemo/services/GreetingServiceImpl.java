package com.goncharoff.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO = "Hello! - Original";

    @Override
    public String sayHello() {
        return HELLO;
    }
}
