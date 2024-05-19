package com.gildedrose.service;

import com.gildedrose.Item;

/**
 * @author Muralitharan R K
 * @project javakata
 * <p></p>
 * <p>This Product Update class contains the common functionalities of the Product Service</p>
 */
public class ProductUpdate {
    public void updateQuality(Item item, int itemQuality) {
        item.quality = (Math.max(item.quality, (item.quality + itemQuality)) > 50) ? 50 : (item.quality + itemQuality);
    }

    public boolean isValidSellIn(Item item) {
        return item.sellIn < 0;
    }

    public void updateSellIn(Item item) {
        item.sellIn--;
    }

    public void resetQuality(Item item) {
        item.quality = 0;
    }
}
