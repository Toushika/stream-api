package com.enigma.dev.checkInfoUtility;

import com.enigma.dev.model.Product;

import java.util.List;

public class CheckInfoUtility {
    public void checkPrice(List<Product> productList,List<Product> newProductList){
        for(Product p: productList){
            if(p.getProductPrice()>25000){
                newProductList.add(p);
            }
        }

        for(Product sortedProduct: newProductList){
            System.out.println(sortedProduct);

        }

    }
}
