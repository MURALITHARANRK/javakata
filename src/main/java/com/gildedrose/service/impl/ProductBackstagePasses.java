package com.gildedrose.service.impl;

import com.gildedrose.Item;
import com.gildedrose.service.ProductService;

/**
 * @author Muralitharan R K
 * @project javakata
 * <p></p>
 * <p>This ProductBackstagePasses product class implemented the two abstract methods of the Product Service</p>
 */
public class ProductBackstagePasses implements ProductService {

    /**
     * @param item
     */
    @Override
    public void updateProductQuality(Item item) {
        int qualityValue = (item.sellIn > 10) ? 1 : (item.sellIn > 5) ? 2 : (item.sellIn > 0) ? 3 : 0;
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
