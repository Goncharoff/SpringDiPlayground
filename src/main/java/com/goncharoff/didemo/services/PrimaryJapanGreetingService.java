package com.goncharoff.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("jp")
public class PrimaryJapanGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        return "おはよお！";
    }
}
