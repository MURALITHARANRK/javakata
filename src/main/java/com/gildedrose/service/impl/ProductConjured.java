package com.gildedrose.service.impl;

import com.gildedrose.Item;
import com.gildedrose.service.ProductService;

/**
 * @author Muralitharan R K
 * @project javakata
 * <p></p>
 * <p>This ProductConjured product class implemented the two abstract methods of the Product Service</p>
 */
public class ProductConjured implements ProductService {

    /**
     * @param item
     * @return
     */
    @Override
    public ProductConjured updateProductQuality(Item item) {
        int qualityValue = isValidSellIn(item) ? -4 : -2;
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
