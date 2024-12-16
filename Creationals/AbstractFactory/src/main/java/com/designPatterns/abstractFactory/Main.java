package com.designPatterns.abstractFactory;

import com.designPatterns.abstractFactory.factories.GalaClothesFactory;
import com.designPatterns.abstractFactory.factories.SportClothesFactory;
import com.designPatterns.abstractFactory.products.shirt.GalaShirt;
import com.designPatterns.abstractFactory.products.shirt.SportShirt;
import com.designPatterns.abstractFactory.products.shoe.GalaShoe;
import com.designPatterns.abstractFactory.products.shoe.SportShoe;
import com.designPatterns.abstractFactory.products.trouser.GalaTrouser;
import com.designPatterns.abstractFactory.products.trouser.SportTrouser;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Logger log = Logger.getLogger(Main.class.getName());

        /* Sport Clothe Factory */

        ClothesFactory sportClotheFactory = new SportClothesFactory();

        SportShirt sportShirt = (SportShirt) sportClotheFactory.createShirt();
        SportTrouser sportTrousers = (SportTrouser) sportClotheFactory.createTrousers();
        SportShoe sportShoe = (SportShoe) sportClotheFactory.createShoe();

        log.info("\n--> Sport Clothes Example <--");
        sportShirt.hasButtons();
        sportTrousers.getClosureType();
        sportShoe.isRunningShoes();


        /* Gala Clothe Factory */

        ClothesFactory galaClotheFactory = new GalaClothesFactory();

        GalaShirt galaShirt = (GalaShirt) galaClotheFactory.createShirt();
        GalaTrouser galaTrouser = (GalaTrouser) galaClotheFactory.createTrousers();
        GalaShoe galaShoe =  (GalaShoe) galaClotheFactory.createShoe();

        log.info("\n--> Gala Clothes Example <--");
        galaShirt.hasButtons();
        galaTrouser.hasPockets();
        galaShoe.isRunningShoes();




    }
}