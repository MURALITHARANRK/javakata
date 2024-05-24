package com.gildedrose.service.impl;

import com.gildedrose.Item;
import com.gildedrose.service.ItemService;

/**
 * @author Muralitharan R K
 * @project javakata
 * <p></p>
 * <p>This ItemAgedBrieImpl class implemented the two abstract methods of the ItemService</p>
 */
public class ItemAgedBrieImpl implements ItemService {

    /**
     * @param item
     * @return
     */
    @Override
    public ItemAgedBrieImpl updateItemQuality(Item item) {
        int qualityValue = isValidSellIn(item) ? 2 : 1;
        updateQuality(item, qualityValue);
        return this;
    }

    /**
     * @param item
     */
    @Override
    public void updateItemSellIn(Item item) {
        updateSellIn(item);
    }
}
