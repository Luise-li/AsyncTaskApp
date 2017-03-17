package com.luise.common.util;

import java.util.List;

/**
 * Created by john 
 * on 2017/3/17 14:16.
 */

public class CollectionUtil {

    /**
     * judge whether the collection is empty.
     * @param collection
     * */
    public static boolean isEmpty(List collection) {
        return collection == null || collection.size() <= 0;
    }
}
