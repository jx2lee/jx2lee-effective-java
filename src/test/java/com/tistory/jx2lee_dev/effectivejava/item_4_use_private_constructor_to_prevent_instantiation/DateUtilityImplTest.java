package com.tistory.jx2lee_dev.effectivejava.item_4_use_private_constructor_to_prevent_instantiation;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Date;

@Slf4j
class DateUtilityImplTest {
    @Test
    void anyone_instantiate() {
        // anyone can instantiate from subclass (DateUtilityImpl)
        DateUtilityImpl dateUtility = new DateUtilityImpl();
        log.info(dateUtility.convertDateToString(new Date()));
    }
}