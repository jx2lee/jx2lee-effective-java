package com.tistory.jx2lee_dev.effectivejava.item_3_use_private_or_enum_when_create_singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

// https://velog.io/@lychee/이펙티브-자바-아이템-3.-private-생성자나-열거-타입으로-싱글턴임을-보증하라
@Slf4j
class ElvisPrivateConstructorTest {
    // Logger logger = LoggerFactory.getLogger(ElvisPrivateConstructorTest.class);
    @Test
    void is_singleton() {
        // given
        ElvisPrivateConstructor instance_1 = ElvisPrivateConstructor.INSTANCE;
        ElvisPrivateConstructor instance_2 = ElvisPrivateConstructor.INSTANCE;

        // expected
        assertSame(instance_1, instance_2);
        log.info("\ninstance_1.class={}\ninstance_2.class={}", instance_1, instance_2);
    }

    @Test
    void is_not_singleton_when_use_reflection_api() throws
            NoSuchMethodException,
            InvocationTargetException,
            InstantiationException,
            IllegalAccessException {
        // given
        ElvisPrivateConstructor instance_1 = ElvisPrivateConstructor.INSTANCE;

        // when
        Constructor<ElvisPrivateConstructor> constructor =
                (Constructor<ElvisPrivateConstructor>) instance_1.getClass().getDeclaredConstructor();
        constructor.setAccessible(true);
        ElvisPrivateConstructor instance_2 = constructor.newInstance();

        assertNotSame(instance_1, instance_2);
        log.info("\ninstance_1.class={}\ninstance_2.class={}", instance_1, instance_2);
    }
}