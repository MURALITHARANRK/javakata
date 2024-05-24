package com.gildedrose.service.impl;

import com.gildedrose.Item;
import com.gildedrose.service.ItemService;

/**
 * @author Muralitharan R K
 * @project javakata
 * <p></p>
 * <p>This ItemConjuredImpl class implemented the two abstract methods of the ItemService</p>
 */
public class ItemConjuredImpl implements ItemService {

    /**
     * @param item
     * @return
     */
    @Override
    public ItemConjuredImpl updateItemQuality(Item item) {
        int qualityValue = isValidSellIn(item) ? -4 : -2;
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
