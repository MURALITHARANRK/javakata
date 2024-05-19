package com.gildedrose;

import com.gildedrose.service.ProductRegistry;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ProductRegistry.updateProductQuality(item);
        }
    }
}
