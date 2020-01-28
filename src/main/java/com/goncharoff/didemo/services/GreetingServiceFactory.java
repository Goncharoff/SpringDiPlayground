package com.goncharoff.didemo.services;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {

        switch (lang){
            case "ru":
                return new PrimaryRussianGreetingService(greetingRepository);
            case "jp":
                return new PrimaryJapanGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }

    }
}
