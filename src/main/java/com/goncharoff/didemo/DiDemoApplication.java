package com.goncharoff.didemo;

import com.goncharoff.didemo.controllers.ConstructorInjectedController;
import com.goncharoff.didemo.controllers.MyController;
import com.goncharoff.didemo.controllers.PropertyInjectedController;
import com.goncharoff.didemo.controllers.SetterInjectedController;
import com.goncharoff.didemo.examplebeans.FakeDataSource;
import com.goncharoff.didemo.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");

//        System.out.println(controller.hello());
//        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
//        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
//        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello(   ));

        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);

        System.out.println(fakeDataSource.getUser());
        System.out.println(fakeJmsBroker.getUsername());
    }

}
