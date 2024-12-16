package com.designPatterns.abstractFactory.products.shirt;

import com.designPatterns.abstractFactory.products.IShirt;

import java.util.logging.Logger;

public class GalaShirt implements IShirt {

    Logger log = Logger.getLogger(GalaShirt.class.getName());

    @Override
    public boolean hasLongSleeves() {
        log.info(" Gala Shirt -- Has long sleeves? -> Yes");
        return true;
    }

    @Override
    public boolean hasButtons() {
        log.info(" Gala Shirt -- Has buttons? -> Yes");
        return true;
    }
}
