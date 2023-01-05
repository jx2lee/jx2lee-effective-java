package com.tistory.jx2lee_dev.effectivejava.item_4_use_private_constructor_to_prevent_instantiation;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

@Slf4j
class DateUtilityWithPrivateConstructorTest {

    @Test
    void anyone_cannot_instantiate() {
        // cannot create instance from DateUtilityWithPrivateConstructor.
        // only use Class.Method
        log.info(DateUtilityWithPrivateConstructor.convertDateToString(new Date()));
    }
}