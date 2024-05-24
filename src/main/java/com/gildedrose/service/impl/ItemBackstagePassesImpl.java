package com.gildedrose.service.impl;

import com.gildedrose.Item;
import com.gildedrose.service.ItemService;

/**
 * @author Muralitharan R K
 * @project javakata
 * <p></p>
 * <p>This ItemBackstagePassesImpl class implemented the two abstract methods of the ItemService</p>
 */
public class ItemBackstagePassesImpl implements ItemService {

    /**
     * @param item
     * @return
     */
    @Override
    public ItemBackstagePassesImpl updateItemQuality(Item item) {
        int qualityValue = (item.sellIn > 10) ? 1 : (item.sellIn > 5) ? 2 : (item.sellIn > 0) ? 3 : 0;
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
