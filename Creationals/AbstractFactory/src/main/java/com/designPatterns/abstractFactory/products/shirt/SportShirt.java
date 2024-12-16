package com.designPatterns.abstractFactory.products.shirt;

import com.designPatterns.abstractFactory.products.IShirt;

import java.util.logging.Logger;

public class SportShirt implements IShirt {

    Logger log = Logger.getLogger(SportShirt.class.getName());

    @Override
    public boolean hasLongSleeves() {
        log.info(" Sport Shirt -- Has long sleeves? -> No");
        return false;
    }

    @Override
    public boolean hasButtons() {
        log.info(" Sport Shirt -- Has buttons? -> No");
        return false;
    }
}
