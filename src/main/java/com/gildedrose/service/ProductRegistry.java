package com.gildedrose.service;

import com.gildedrose.Item;
import com.gildedrose.service.impl.*;

/**
 * @author Muralitharan R K
 * @project javakata
 * <p></p>
 * <p>This ProductRegistry class has an entry point of the Product. Where product has been initialized to Product Service based of the product name</p>
 */
public class ProductRegistry {

    public static void updateProductQuality(Item item) {

        ProductService productService;

        switch (item.name) {
            case ProductList.AGED_BRIE:
                productService = new AgedBrie();
                break;
            case ProductList.BACKSTAGE_PASSES:
                productService = new BackstagePasses();
                break;
            case ProductList.CONJURED:
                productService = new Conjured();
                break;
            case ProductList.SULFURAS:
                productService = new Sulfuras();
                break;
            default:
                productService = new StandardItems();
                break;
        }

        productService.updateProductQuality(item);
        productService.updateProductSellIn(item);
    }
}
