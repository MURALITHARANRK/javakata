package com.gildedrose.service.impl;

import com.gildedrose.Item;
import com.gildedrose.service.ProductService;

/**
 * @author Muralitharan R K
 * @project javakata
 * <p></p>
 * <p>This Conjured product class implemented the two abstract methods of the Product Service</p>
 */
public class Conjured implements ProductService {

    /**
     * @param item
     */
    @Override
    public void updateProductQuality(Item item) {
        int qualityValue = isValidSellIn(item) ? -4 : -2;
        updateQuality(item, qualityValue);
    }

    /**
     * @param item
     */
    @Override
    public void updateProductSellIn(Item item) {
        updateSellIn(item);
    }
}
