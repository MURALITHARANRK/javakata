package com.gildedrose.service;

import com.gildedrose.Item;

/**
 * @author Muralitharan R K
 * @project javakata
 * <p></p>
 * <p>This ItemService interface will be having two abstract methods which should have been implemented whenever new item tried to implement this interface.</p>
 * <ul>
 * <li>updateItemQuality method</li>
 * <li>updateItemSellIn method</li>
 * </ul>
 * <p>Some common functionalities of the Item Service methods added under default method</p>
 */
public interface ItemService {

    int MAX_QUALITY = 50;
    int MIN_QUALITY = 0;

    ItemService updateItemQuality(Item item);

    void updateItemSellIn(Item item);

    /**
     * Validating the item whether it is valid to sell or not.
     */
    default boolean isValidSellIn(Item item) {
        return item.sellIn <= 0;
    }

    /**
     * The Quality of an item should not be more than <b>50</b> as well as should not be in negative.
     */
    default void updateQuality(Item item, int itemQuality) {
        if (itemQuality == 0) {
            item.quality = 0;
        } else {
            int qualityValue = item.quality + itemQuality;
            if (itemQuality > 0) {
                item.quality = getMaxQualityValue(item, qualityValue);
            } else {
                item.quality = getMinQualityValue(item, qualityValue);
            }
        }
    }

    /**
     * This function will return the minimum value of the item quality. Which should not be in negative.
     */
    default int getMinQualityValue(Item item, int qualityValue) {
        return Math.min(item.quality, qualityValue) < MIN_QUALITY ? MIN_QUALITY : (Math.max(item.quality, qualityValue) > MAX_QUALITY ? MAX_QUALITY : qualityValue);
    }

    /**
     * This function will return the maximum value of the item quality. Which should not be more than 50.
     */
    default int getMaxQualityValue(Item item, int qualityValue) {
        return Math.max(item.quality, qualityValue) > MAX_QUALITY ? MAX_QUALITY : (Math.min(item.quality, qualityValue) < MIN_QUALITY ? MIN_QUALITY : qualityValue);
    }

    /**
     * Decrease the item sellIn value
     */
    default void updateSellIn(Item item) {
        item.sellIn--;
    }

}
