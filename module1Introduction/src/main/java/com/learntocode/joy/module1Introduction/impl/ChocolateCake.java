package com.learntocode.joy.module1Introduction.impl;

import com.learntocode.joy.module1Introduction.Frosting;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component

//@ConditionalOnProperty(name = "notification.type", havingValue = "email")
public class ChocolateCake implements Frosting {


    @Override
    public String getFrostingType() {
        return "Chocolate Frosting" ;
    }
}
