package com.prototype;

import com.prototype.prototype.PriceList;
import com.prototype.prototype.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Lista de precios inicial
        PriceList priceList = new PriceList("Lista normal");
        List<Product> productList = List.of(
                new Product("Computadora",650000),
                new Product("Mouse",120000),
                new Product("Teclado",80000),
                new Product("Pantalla",1350000),
                new Product("Auriculares",40000)
        );

        priceList.setProductList(productList);

        System.out.println(priceList);


        // Segunda lista de precios con descuento

        PriceList priceList2 = priceList.deepClone();
        priceList2.setName("Lista Preferencial");


        for (Product product : priceList2.getProductList()) {
            product.setPrice(product.getPrice() * 0.9);
        }

        System.out.println(priceList2);
    }
}