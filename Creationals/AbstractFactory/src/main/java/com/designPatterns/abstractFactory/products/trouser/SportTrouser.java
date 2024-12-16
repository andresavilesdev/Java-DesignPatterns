package com.designPatterns.abstractFactory.products.trouser;

import com.designPatterns.abstractFactory.products.ITrousers;

import java.util.logging.Logger;

public class SportTrouser implements ITrousers {

    Logger log = Logger.getLogger(SportTrouser.class.getName());

    @Override
    public boolean hasPockets() {
        log.info(" Sport Trouser -- Has pockets? -> No");
        return false;
    }

    @Override
    public String getClosureType() {
        log.info(" Sport Trouser -- Closure Type? -> Has not");
        return "Has not";
    }
}
