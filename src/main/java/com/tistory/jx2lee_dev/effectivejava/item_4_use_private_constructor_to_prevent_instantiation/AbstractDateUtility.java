package com.tistory.jx2lee_dev.effectivejava.item_4_use_private_constructor_to_prevent_instantiation;

import java.text.SimpleDateFormat;
import java.util.Date;

abstract class AbstractDateUtility {
    private String FULL_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";
    String convertDateToString(Date date) {
        return new SimpleDateFormat(FULL_DATE_FORMAT).format(date);
    }
}
