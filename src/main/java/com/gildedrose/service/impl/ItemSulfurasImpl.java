package com.gildedrose.service.impl;

import com.gildedrose.Item;
import com.gildedrose.service.ItemService;

/**
 * @author Muralitharan R K
 * @project javakata
 * <p></p>
 * <p>This ItemSulfurasImpl class implemented the two abstract methods of the ItemService, Even though, implementation is not required as per the requirements </p>
 */
public class ItemSulfurasImpl implements ItemService {
    /**
     * @param item
     * @return
     */
    @Override
    public ItemSulfurasImpl updateItemQuality(Item item) {
        // For Sulfuras product no need to update quality
        return this;
    }

    /**
     * @param item
     */
    @Override
    public void updateItemSellIn(Item item) {
        // For Sulfuras product no need to update sellIn
    }
}
