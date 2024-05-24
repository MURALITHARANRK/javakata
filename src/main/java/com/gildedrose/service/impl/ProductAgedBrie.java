package com.gildedrose.service.impl;

import com.gildedrose.Item;
import com.gildedrose.service.ProductService;

/**
 * @author Muralitharan R K
 * @project javakata
 * <p></p>
 * <p>This ProductAgedBrie product class implemented the two abstract methods of the Product Service</p>
 */
public class ProductAgedBrie implements ProductService {

    /**
     * @param item
     * @return
     */
    @Override
    public ProductAgedBrie updateProductQuality(Item item) {
        int qualityValue = isValidSellIn(item) ? 2 : 1;
        updateQuality(item, qualityValue);
        return this;
    }

    /**
     * @param item
     */
    @Override
    public void updateProductSellIn(Item item) {
        updateSellIn(item);
    }
}
