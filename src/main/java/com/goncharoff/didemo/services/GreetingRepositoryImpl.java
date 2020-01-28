package com.goncharoff.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello from primary greeting service";
    }

    @Override
    public String getRussianGreeting() {
        return "Приветик с ру праймал профайла";
    }

    @Override
    public String getJapanGreeting() {
        return "おはよお！";
    }
}