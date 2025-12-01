package com.learntocode.joy.module1Introduction.impl;

import com.learntocode.joy.module1Introduction.Syrup;
import org.springframework.stereotype.Component;

//@Primary
@Component
public class Strawberry implements Syrup {

    @Override
    public String getSyrupType() {
        return "Strawberry Syrup";
    }
}
