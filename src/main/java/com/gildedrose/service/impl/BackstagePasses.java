package com.gildedrose.service.impl;

import com.gildedrose.Item;
import com.gildedrose.service.ProductService;

/**
 * @author Muralitharan R K
 * @project javakata
 * <p></p>
 * <p>This BackstagePasses product class implemented the two abstract methods of the Product Service</p>
 */
public class BackstagePasses implements ProductService {

    /**
     * @param item
     */
    @Override
    public void updateProductQuality(Item item) {
        int qualityValue = 0;
        if (item.sellIn > 10) {
            qualityValue = 1;
        } else if (item.sellIn > 5) {
            qualityValue = 2;
        } else if (item.sellIn > 0) {
            qualityValue = 3;
        } else {
            resetQuality(item);
        }

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
