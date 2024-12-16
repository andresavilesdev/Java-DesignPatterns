package com.designPatterns.abstractFactory.factories;

import com.designPatterns.abstractFactory.ClothesFactory;
import com.designPatterns.abstractFactory.products.IShirt;
import com.designPatterns.abstractFactory.products.IShoe;
import com.designPatterns.abstractFactory.products.ITrousers;
import com.designPatterns.abstractFactory.products.shirt.GalaShirt;
import com.designPatterns.abstractFactory.products.shoe.GalaShoe;
import com.designPatterns.abstractFactory.products.trouser.GalaTrouser;

public class GalaClothesFactory implements ClothesFactory {
    @Override
    public IShoe createShoe() {
        return new GalaShoe();
    }

    @Override
    public IShirt createShirt() {
        return new GalaShirt();
    }

    @Override
    public ITrousers createTrousers() {
        return new GalaTrouser();
    }
}
