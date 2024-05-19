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
 */
public interface ProductService {

    void updateProductQuality(Item item);

    void updateProductSellIn(Item item);

}
