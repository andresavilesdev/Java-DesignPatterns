package com.designPatterns.abstractFactory.products.shoe;

import com.designPatterns.abstractFactory.products.IShoe;

import java.util.logging.Logger;

public class SportShoe implements IShoe {

    Logger log = Logger.getLogger(SportShoe.class.getName());

    @Override
    public boolean isElegantShoes() {
        log.info(" Sport Shoe -- Is elegant shoe? -> No");
        return false;
    }

    @Override
    public boolean isRunningShoes() {
        log.info(" Sport Shoe -- Is running shoe? -> Yes");
        return true;
    }
}
