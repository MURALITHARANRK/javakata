package com.gildedrose.service.impl;

import com.gildedrose.Item;
import com.gildedrose.service.ProductService;
import com.gildedrose.service.ProductUpdate;

/**
 * @author Muralitharan R K
 * @project javakata
 * <p></p>
 * <p>This BackstagePasses product class implemented the two abstract methods of the Product Service</p>
 */
public class BackstagePasses implements ProductService {

    private final ProductUpdate productUpdate = new ProductUpdate();

    /**
     * @param item
     */
    @Override
    public void updateProductQuality(Item item) {
        int qualityValue = 0;
        if (item.sellIn > 10) {
            qualityValue = 1;
        } else if (item.sellIn > 6) {
            qualityValue = 2;
        } else if (item.sellIn > 0) {
            qualityValue = 3;
        } else {
            productUpdate.resetQuality(item);
        }

        productUpdate.updateQuality(item, qualityValue);
    }

    /**
     * @param item
     */
    @Override
    public void updateProductSellIn(Item item) {
        productUpdate.updateSellIn(item);
    }
}
