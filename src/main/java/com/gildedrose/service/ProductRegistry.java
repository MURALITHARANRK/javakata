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
    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final String CONJURED = "Conjured";

    public static void updateProductQuality(Item item){

        ProductService productService;

        switch (item.name) {
            case AGED_BRIE:
                productService = new AgedBrie();
                break;
            case BACKSTAGE_PASSES:
                productService = new BackstagePasses();
                break;
            case CONJURED:
                productService = new Conjured();
                break;
            case SULFURAS:
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
