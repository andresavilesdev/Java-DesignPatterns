package com.designPatterns.abstractFactory.factories;

import com.designPatterns.abstractFactory.ClothesFactory;
import com.designPatterns.abstractFactory.products.IShirt;
import com.designPatterns.abstractFactory.products.IShoe;
import com.designPatterns.abstractFactory.products.ITrousers;
import com.designPatterns.abstractFactory.products.shirt.SportShirt;
import com.designPatterns.abstractFactory.products.shoe.SportShoe;
import com.designPatterns.abstractFactory.products.trouser.SportTrouser;

public class SportClothesFactory implements ClothesFactory {

    @Override
    public IShoe createShoe() {
        return new SportShoe();
    }

    @Override
    public IShirt createShirt() {
        return new SportShirt();
    }

    @Override
    public ITrousers createTrousers() {
        return new SportTrouser();
    }
}
