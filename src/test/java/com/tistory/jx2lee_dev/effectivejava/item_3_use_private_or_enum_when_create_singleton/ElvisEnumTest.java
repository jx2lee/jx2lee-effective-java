package com.tistory.jx2lee_dev.effectivejava.item_3_use_private_or_enum_when_create_singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class ElvisEnumTest {
    @Test
    void is_singleton() {
        String name = ElvisEnum.INSTANCE.getName();
        String expectedEqualName = ElvisEnum.INSTANCE.getName();

        Assertions.assertSame(name, expectedEqualName);
    }
}