package com.gildedrose.service.impl;

import com.gildedrose.Item;
import com.gildedrose.service.ProductService;

/**
 * @author Muralitharan R K
 * @project javakata
 * <p></p>
 * <p>This ProductSulfuras product class implemented the two abstract methods of the Product Service, Even though, implementation has not been done as per the requirements </p>
 */
public class ProductSulfuras implements ProductService {
    /**
     * @param item
     * @return
     */
    @Override
    public ProductSulfuras updateProductQuality(Item item) {
        // For Sulfuras product no need to update quality
        return this;
    }

    /**
     * @param item
     */
    @Override
    public void updateProductSellIn(Item item) {
        // For Sulfuras product no need to update sellIn
    }
}
