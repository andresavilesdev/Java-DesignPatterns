package com.designPatterns.abstractFactory.products.shoe;

import com.designPatterns.abstractFactory.products.IShoe;

import java.util.logging.Logger;

public class GalaShoe implements IShoe {

    Logger log = Logger.getLogger(GalaShoe.class.getName());

    @Override
    public boolean isElegantShoes() {
        log.info(" Gala Shirt -- Is elegant shoe? -> Yes");
        return true;
    }

    @Override
    public boolean isRunningShoes() {
        log.info(" Gala Shirt -- Is running shoe? -> No");
        return false;
    }
}
