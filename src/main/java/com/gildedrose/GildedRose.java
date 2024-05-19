package com.gildedrose;

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
            if (item.name.equals(SULFURAS)) {
                return;
            } else {
                if (!item.name.equals(AGED_BRIE)
                    && !item.name.equals(BACKSTAGE_PASSES)) {
                    decreaseQuality(item);
                    if (item.name.equals(CONJURED)) {
                        decreaseQuality(item);
                    }
                } else {
                    increaseQuality(item);
                    if (item.name.equals(BACKSTAGE_PASSES)) {
                        if (item.sellIn < 11) {
                            increaseQuality(item);
                        }

                        if (item.sellIn < 6) {
                            increaseQuality(item);
                        }
                    }
                }

                updateSellIn(item);

                if (item.sellIn < 0) {
                    if (!item.name.equals(AGED_BRIE)) {
                        if (!item.name.equals(BACKSTAGE_PASSES)) {
                            decreaseQuality(item);
                            if(item.name.equals(CONJURED)){
                                decreaseQuality(item);
                            }
                        } else {
                            item.quality = 0;
                        }
                    } else {
                        increaseQuality(item);
                    }
                }
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
}
