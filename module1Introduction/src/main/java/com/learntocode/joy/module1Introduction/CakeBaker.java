package com.learntocode.joy.module1Introduction;

import org.springframework.stereotype.Component;
@Component
public class CakeBaker {

    private final Frosting frosting;
    private final Syrup syrup;

    CakeBaker(Frosting frosting, Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public void bakeCake() {
        System.out.println("Baking delicious cake with "
                + frosting.getFrostingType() + " and " + syrup.getSyrupType() + "!");
    }
}
