package com.goncharoff.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{

    @Override
    public String sayHello() {
        return "Hi, injected by setter.";
    }
}
