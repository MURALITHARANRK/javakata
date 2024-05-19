package com.gildedrose.service.impl;

import com.gildedrose.Item;
import com.gildedrose.service.ProductService;
import com.gildedrose.service.ProductUpdate;

/**
 * @author Muralitharan R K
 * @project javakata
 * <p></p>
 * <p>This StandardItems product class implemented the two abstract methods of the Product Service</p>
 */
public class StandardItems implements ProductService {

    private final ProductUpdate productUpdate = new ProductUpdate();

    /**
     * @param item
     */
    @Override
    public void updateProductQuality(Item item) {
        int qualityValue;
        if(productUpdate.isValidSellIn(item)){
            qualityValue = -2;
        }else{
            qualityValue = -1;
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
