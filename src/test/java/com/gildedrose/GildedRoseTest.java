package com.gildedrose;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Each test scenario of this inventory project has been covered by Unit test.
 *
 * @author Muralitharan R K
 * @project Java Kata
 */
class GildedRoseTest {

    @ParameterizedTest
    @CsvSource({"'New Product', 4, 9, 3, 8"})
    public void sellIn_and_quality_should_be_decreased_each_day(String itemName, int itemSellIn, int itemQuality, int expectedSellInValue, int expectedQualityValue) {

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(expectedSellInValue, item.sellIn);
        assertEquals(expectedQualityValue, item.quality);
    }

    @ParameterizedTest
    @CsvSource({"'New Product', 0, 10, 8"})
    public void when_sellIn_value_less_than_or_equal_to_zero_then_quality_should_be_decreased_twice(String itemName, int itemSellIn, int itemQuality, int expectedResult) {

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(expectedResult, item.quality);
    }

    @ParameterizedTest
    @CsvSource({"'New Product', 15, 0, 0"})
    public void quality_of_an_item_is_never_negative(String itemName, int itemSellIn, int itemQuality, int expectedResult) {

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(expectedResult, item.quality);
    }

    @ParameterizedTest
    @CsvSource({"'New Product', 10, 11, 10", "'New Product', 9, 10, 9", "'New Product', 8, 9, 8"})
    public void sellIn_and_quality_value_should_be_decreased_for_multiple_items(String itemName, int itemSellIn, int itemQuality, int expectedResult) {

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(expectedResult, item.quality);
    }

    @ParameterizedTest
    @CsvSource({"'Aged Brie', 10, 5, 6"})
    public void increase_the_quality_of_aged_brie_when_it_gets_older(String itemName, int itemSellIn, int itemQuality, int expectedResult) {

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(expectedResult, item.quality);
    }

    @ParameterizedTest
    @CsvSource({"'Aged Brie', 15, 50, 50"})
    public void quality_of_an_item_is_never_more_than_50(String itemName, int itemSellIn, int itemQuality, int expectedResult) {

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(expectedResult, item.quality);
    }

    @ParameterizedTest
    @CsvSource({"'Aged Brie', 6, 7, 8", "'Aged Brie', 5, 49, 50", "'Aged Brie', 10, 50, 50", "'Aged Brie', 0, 10, 12"})
    public void aged_brie_update_quality_for_multiple_items(String itemName, int itemSellIn, int itemQuality, int expectedResult) {

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(expectedResult, item.quality);
    }

    @ParameterizedTest
    @CsvSource({"'Sulfuras, Hand of Ragnaros', 15, 5, 15, 5"})
    public void sellIn_and_quality_values_should_not_be_decreased_for_sulfuras(String itemName, int itemSellIn, int itemQuality, int expectedSellInValue, int expectedQualityValue) {

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(expectedSellInValue, item.sellIn);
        assertEquals(expectedQualityValue, item.quality);
    }

    @ParameterizedTest
    @CsvSource({"'Sulfuras, Hand of Ragnaros', 15, 80, 80"})
    public void quality_value_of_the_legendary_item_sulfuras_should_not_be_80(String itemName, int itemSellIn, int itemQuality, int expectedResult) {

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(expectedResult, item.quality);
    }

    @ParameterizedTest
    @CsvSource({"'Backstage passes to a TAFKAL80ETC concert', 15, 1, 2"})
    public void backstage_passes_increase_the_quality_value_when_sellIn_value_approaches(String itemName, int itemSellIn, int itemQuality, int expectedResult) {

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(expectedResult, item.quality);
    }

    @ParameterizedTest
    @CsvSource({"'Backstage passes to a TAFKAL80ETC concert', 15, 49, 50"})
    public void backstage_passes_increase_the_quality_value_upto_50_when_sellIn_value_approaches(String itemName, int itemSellIn, int itemQuality, int expectedResult) {

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(expectedResult, item.quality);
    }

    @ParameterizedTest
    @CsvSource({"'Backstage passes to a TAFKAL80ETC concert', 10, 10, 12"})
    public void backstage_passes_increases_in_quality_by_2_when_sellIn_value_less_than_or_equal_10(String itemName, int itemSellIn, int itemQuality, int expectedResult) {

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(expectedResult, item.quality);
    }

    @ParameterizedTest
    @CsvSource({"'Backstage passes to a TAFKAL80ETC concert', 4, 13, 16"})
    public void backstage_passes_increases_in_quality_by_3_when_sellIn_value_less_than_or_equal_5(String itemName, int itemSellIn, int itemQuality, int expectedResult) {

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(expectedResult, item.quality);
    }

    @ParameterizedTest
    @CsvSource({"'Backstage passes to a TAFKAL80ETC concert', 0, 13, 0"})
    public void backstage_passes_quality_should_be_0_after_the_concert(String itemName, int itemSellIn, int itemQuality, int expectedResult) {

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(expectedResult, item.quality);
    }

    @ParameterizedTest
    @CsvSource({"'Backstage passes to a TAFKAL80ETC concert', 0, 13, 0", "'Backstage passes to a TAFKAL80ETC concert', 4, 13, 16", "'Backstage passes to a TAFKAL80ETC concert', 6, 46, 48", "'Backstage passes to a TAFKAL80ETC concert', 10, 49, 50", "'Backstage passes to a TAFKAL80ETC concert',11, 30, 31"})
    public void backstage_passes_update_quality_for_multitple_items(String itemName, int itemSellIn, int itemQuality, int expectedResult) {

        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(expectedResult, item.quality);
    }

    @ParameterizedTest
    @CsvSource({"'Conjured Mana Cake', 1, 13, 11"})
    public void conjured_item_quality_value_should_be_decreased_by_2(String itemName, int itemSellIn, int itemQuality, int expectedResult) {
        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(expectedResult, item.quality);
    }

    @ParameterizedTest
    @CsvSource({"'Conjured Mana Cake', 2, 1, 0"})
    public void conjured_item_quality_value_should_not_be_in_negative(String itemName, int itemSellIn, int itemQuality, int expectedResult) {
        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(expectedResult, item.quality);
    }

    @ParameterizedTest
    @CsvSource({"'Conjured Mana Cake', 0, 10, 6"})
    public void conjured_item_quality_value_should_be_decreased_by_4_if_product_expired(String itemName, int itemSellIn, int itemQuality, int expectedResult) {
        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(expectedResult, item.quality);
    }

    @ParameterizedTest
    @CsvSource({"'Conjured Mana Cake', 10, 20, 18", "'Conjured Mana Cake', 0, 10, 6", "'Conjured Mana Cake', 10, 1, 0"})
    public void conjured_item_quality_update_multiple_items(String itemName, int itemSellIn, int itemQuality, int expectedResult) {
        Item item = new Item(itemName, itemSellIn, itemQuality);
        GildedRose gildedRose = new GildedRose(new Item[]{item});

        gildedRose.updateQuality();

        assertEquals(expectedResult, item.quality);
    }


}
