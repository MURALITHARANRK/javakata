package com.gildedrose;

import com.gildedrose.service.impl.AgedBrie;

class GildedRose {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final String CONJURED = "Conjured";
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case SULFURAS:
                    return;
                case AGED_BRIE:
                    agedBrie(item);
                    break;
                case BACKSTAGE_PASSES:
                    backstagePasses(item);
                    break;
                case CONJURED:
                    conjured(item);
                    break;
                default:
                    commonItems(item);
                    break;
            }
        }
    }

    private void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    private void updateSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    private void commonItems(Item item) {
        decreaseQuality(item);
        updateSellIn(item);
        if (item.sellIn < 0) {
            decreaseQuality(item);
        }
    }

    private void agedBrie(Item item) {
        AgedBrie agedBrie = new AgedBrie();
        agedBrie.updateProductQuality(item);
        agedBrie.updateProductSellIn(item);
    }

    private void backstagePasses(Item item) {
        increaseQuality(item);
        if (item.sellIn < 11) {
            increaseQuality(item);
        }

        if (item.sellIn < 6) {
            increaseQuality(item);
        }
        updateSellIn(item);
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }

    private void conjured(Item item) {
        decreaseQuality(item);
        decreaseQuality(item);
        updateSellIn(item);
    }

}
