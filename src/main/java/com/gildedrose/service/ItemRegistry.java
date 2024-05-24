package com.gildedrose.service;

import com.gildedrose.Item;
import com.gildedrose.service.impl.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Muralitharan R K
 * @project javakata
 * <p></p>
 * <p>This ItemRegistry class has an entry point of an Item. Where item object has been initialized to ItemService based on the item name</p>
 */
public class ItemRegistry {

    private static final Map<String, ItemService> itemServiceMap = new HashMap<>();

    public ItemRegistry() {
        itemServiceMap.putIfAbsent(ItemsList.AGED_BRIE, new ItemAgedBrieImpl());
        itemServiceMap.putIfAbsent(ItemsList.BACKSTAGE_PASSES, new ItemBackstagePassesImpl());
        itemServiceMap.putIfAbsent(ItemsList.CONJURED, new ItemConjuredImpl());
        itemServiceMap.putIfAbsent(ItemsList.SULFURAS, new ItemSulfurasImpl());
        itemServiceMap.putIfAbsent(null, new ItemStandardImpl());
    }

    /**
     * updating the item quality and sellIn values
     */
    public void updateItem(Item item) {
        getItemService(item).updateItemQuality(item).updateItemSellIn(item);
    }

    /**
     * Get the Item Object based on the item name
     */
    private ItemService getItemService(Item item) {
        return itemServiceMap.containsKey(item.name) ? itemServiceMap.get(item.name) : itemServiceMap.get(null);
    }
}
