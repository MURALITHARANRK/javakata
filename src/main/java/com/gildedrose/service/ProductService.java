package com.gildedrose.service;

import com.gildedrose.Item;

/**
 * @author Muralitharan R K
 * @project javakata
 * <p></p>
 * <p>This product service interface will be having two abstract methods which should have been implemented whenever new product tried to implement this interface.</p>
 * <ul>
 * <li>updateProductQuality method</li>
 * <li>updateProductSellIn method</li>
 * </ul>
 * <p>Some common functionalities of the Product Service methods added under default method</p>
 */
public interface ProductService {

    int MAX_QUALITY = 50;
    int MIN_QUALITY = 0;

    void updateProductQuality(Item item);

    void updateProductSellIn(Item item);

    /**
     * Validating the product whether it is valid to sell or not.
     */
    default boolean isValidSellIn(Item item) {
        return item.sellIn <= 0;
    }

    /**
     * The Quality of the product should not be more than <b>50</b> as well as should not be in negative.
     */
    default void updateQuality(Item item, int itemQuality) {
        if (itemQuality > 0) {
            item.quality = (Math.max(item.quality, (item.quality + itemQuality)) > MAX_QUALITY) ? MAX_QUALITY : (item.quality + itemQuality);
        } else {
            item.quality = (Math.min(item.quality, (item.quality + itemQuality)) < MIN_QUALITY) ? MIN_QUALITY : (item.quality + itemQuality);
        }
    }

    /**
     * Reduce the product sellIn value
     */
    default void updateSellIn(Item item) {
        item.sellIn--;
    }

    /**
     * Reset the product quality value
     */
    default void resetQuality(Item item) {
        item.quality = 0;
    }

}
