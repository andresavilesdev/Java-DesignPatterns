package com.designPatterns.abstractFactory;

import com.designPatterns.abstractFactory.products.IShirt;
import com.designPatterns.abstractFactory.products.IShoe;
import com.designPatterns.abstractFactory.products.ITrousers;

public interface ClothesFactory {

    IShoe createShoe();
    IShirt createShirt();
    ITrousers createTrousers();

}
