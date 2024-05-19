package com.gildedrose.service;

import com.gildedrose.Item;

/**
 * @author Muralitharan R K
 * @project javakata
 * <p></p>
 * <p>This Product Update class contains the common functionalities of the Product Service</p>
 */
public class ProductUpdate {

    private static final int MAX_QUALITY = 50;
    private static final int MIN_QUALITY = 0;

    /**
     * The Quality of the product should not be more than <b>50</b> as well as should not be in negative.
     */
    public void updateQuality(Item item, int itemQuality) {
        if (itemQuality > 0) {
            item.quality = (Math.max(item.quality, (item.quality + itemQuality)) > MAX_QUALITY) ? MAX_QUALITY : (item.quality + itemQuality);
        } else {
            item.quality = (Math.min(item.quality, (item.quality + itemQuality)) < MIN_QUALITY) ? MIN_QUALITY : (item.quality + itemQuality);
        }
    }

    /**
     * Validating the product whether it is valid to sell or not.
     */
    public boolean isValidSellIn(Item item) {
        return item.sellIn <= 0;
    }

    /**
     * Reduce the product sellIn value
     */
    public void updateSellIn(Item item) {
        item.sellIn--;
    }

    /**
     * Reset the product quality value
     */
    public void resetQuality(Item item) {
        item.quality = 0;
    }
}
