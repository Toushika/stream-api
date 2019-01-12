package com.enigma.dev.checkInfoUtility;

import com.enigma.dev.model.Product;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CheckInfoUtility {
    public void checkPrice(List<Product> productList, List<Product> newProductList) {
        for (Product p : productList) {
            if (p.getProductPrice() > 25000) {
                newProductList.add(p);
            }
        }

        for (Product sortedProduct : newProductList) {
            System.out.println(sortedProduct);

        }
    }

    public void filterPrice(List<Product> productList) {
        List<Product> prod =
                productList.stream().
                        filter((product) -> product.getProductPrice() > 65000)
                        .collect(Collectors.toList());
        System.out.println("Filtering Product List Which Price is greater than 65000:: " + prod);

    }

    public void listUpProductName(List<Product> productList) {

        List<String> prod = productList.stream()
                .map((product) -> product.getProductName())
                .collect(Collectors.toList());
        System.out.println("Fetching Product Name From Product List:: " + prod);

    }

    public List<Product>  productSortedByPrice(List<Product> productList){
      productList.sort(Comparator.comparing(Product::getProductPrice));
      System.out.println("Product List Sorted By Price"+productList);
        return productList;

    }

    public List<Product> traverseProduct(List<Product> productList){
        System.out.println("Traversing Product---");
        productList.stream().forEach(System.out::println);
        return productList;

    }


    }



