package com.goncharoff.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class PrimaryJapanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryJapanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayHello() {
        return greetingRepository.getJapanGreeting();
    }
}
