package com.tistory.jx2lee_dev.effectivejava.item_4_use_private_constructor_to_prevent_instantiation;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;
@Slf4j
class DateUtilityTest {
    @Test
    void anyone_instantiate() {
        Date currentDate = new Date();

        // anyone can use above with creating instance.
        DateUtility dateUtility = new DateUtility();

        Assertions.assertEquals(DateUtility.convertDateToString(currentDate),
                dateUtility.convertDateToString(currentDate));
    }

}