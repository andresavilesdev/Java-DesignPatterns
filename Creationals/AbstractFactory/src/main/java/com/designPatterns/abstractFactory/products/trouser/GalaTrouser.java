package com.designPatterns.abstractFactory.products.trouser;

import com.designPatterns.abstractFactory.products.ITrousers;

import java.util.logging.Logger;

public class GalaTrouser implements ITrousers {

    Logger log = Logger.getLogger(GalaTrouser.class.getName());

    @Override
    public boolean hasPockets() {
        log.info(" Gala Trouser -- Has pockets? -> Yes");
        return true;
    }

    @Override
    public String getClosureType() {
        log.info(" Gala Trouser -- Closure Type? -> Zipper");

        return "Zipper";
    }
}
