package com.gildedrose.service;

import com.gildedrose.Item;
import com.gildedrose.service.impl.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Muralitharan R K
 * @project javakata
 * <p></p>
 * <p>This ProductRegistry class has an entry point of the Product. Where product has been initialized to Product Service based of the product name</p>
 */
public class ProductRegistry {

    private static final Map<String, ProductService> productServiceMap = new HashMap<>();

    public ProductRegistry() {
        productServiceMap.putIfAbsent(ProductList.AGED_BRIE, new ProductAgedBrie());
        productServiceMap.putIfAbsent(ProductList.BACKSTAGE_PASSES, new ProductBackstagePasses());
        productServiceMap.putIfAbsent(ProductList.CONJURED, new ProductConjured());
        productServiceMap.putIfAbsent(ProductList.SULFURAS, new ProductSulfuras());
        productServiceMap.putIfAbsent(null, new ProductStandardItems());
    }

    public void updateProduct(Item item) {
        getProductService(item).updateProductQuality(item).updateProductSellIn(item);
    }

    private ProductService getProductService(Item item) {
        return productServiceMap.containsKey(item.name) ? productServiceMap.get(item.name) : productServiceMap.get(null);
    }
}
