package com.gildedrose.service.impl;

import com.gildedrose.Item;
import com.gildedrose.service.ProductService;
import com.gildedrose.service.ProductUpdate;

/**
 * @author Muralitharan R K
 * @project javakata
 * <p></p>
 * <p>This Conjured product class implemented the two abstract methods of the Product Service</p>
 */
public class Conjured implements ProductService {

    private final ProductUpdate productUpdate = new ProductUpdate();

    /**
     * @param item
     */
    @Override
    public void updateProductQuality(Item item) {
        productUpdate.updateQuality(item, -2);
    }

    /**
     * @param item
     */
    @Override
    public void updateProductSellIn(Item item) {
        productUpdate.updateSellIn(item);
    }
}
