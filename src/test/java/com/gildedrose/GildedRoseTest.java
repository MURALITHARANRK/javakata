package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    public void sellIn_and_quality_should_be_decreased_each_day(){
        String itemName = "New Product";
        int itemSellIn = 4;
        int itemQuality = 9;

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(3, item.sellIn);
        assertEquals(8, item.quality);
    }

    @Test
    public void when_sellIn_value_less_than_or_equal_to_zero_then_quality_should_be_decreased_twice(){
        String itemName = "New Product";
        int itemSellIn = 0;
        int itemQuality = 10;

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(-1, item.sellIn);
        assertEquals(8,item.quality);
    }

    @Test
    public void quality_of_an_item_is_never_negative(){
        String itemName = "New Product";
        int itemSellIn = 15;
        int itemQuality = 0;

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(0, item.quality);
    }

    @Test
    public void increase_the_quality_of_aged_brie_when_it_gets_older(){
        String itemName = "Aged Brie";
        int itemSellIn = 10;
        int itemQuality = 5;

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(6,item.quality);
    }

    @Test
    public void quality_of_an_item_is_never_more_than_50(){
        String itemName = "Aged Brie";
        int itemSellIn = 15;
        int itemQuality = 50;

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(50,item.quality);
    }

    @Test
    public void sellIn_and_quality_values_should_not_be_decreased_for_sulfuras(){
        String itemName = "Sulfuras, Hand of Ragnaros";
        int itemSellIn = 15;
        int itemQuality = 5;

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(15,item.sellIn);
        assertEquals(5, item.quality);
    }

    @Test
    public void backstage_passes_increase_the_quality_value_when_sellIn_value_approaches(){
        String itemName = "Backstage passes to a TAFKAL80ETC concert";
        int itemSellIn = 15;
        int itemQuality = 1;

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(2, item.quality);
    }

    @Test
    public void backstage_passes_increase_the_quality_value_upto_50_when_sellIn_value_approaches(){
        String itemName = "Backstage passes to a TAFKAL80ETC concert";
        int itemSellIn = 15;
        int itemQuality = 49;

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(50, item.quality);
    }

    @Test
    public void backstage_passes_increases_in_quality_by_2_when_sellIn_value_less_than_or_equal_10(){
        String itemName = "Backstage passes to a TAFKAL80ETC concert";
        int itemSellIn = 10;
        int itemQuality = 10;

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(12, item.quality);
    }

    @Test
    public void backstage_passes_increases_in_quality_by_3_when_sellIn_value_less_than_or_equal_5(){
        String itemName = "Backstage passes to a TAFKAL80ETC concert";
        int itemSellIn = 4;
        int itemQuality = 13;

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(16, item.quality);
    }

    @Test
    public void backstage_passes_quality_should_be_0_after_the_concert() {
        String itemName = "Backstage passes to a TAFKAL80ETC concert";
        int itemSellIn = 0;
        int itemQuality = 13;

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(0, item.quality);
    }

}
