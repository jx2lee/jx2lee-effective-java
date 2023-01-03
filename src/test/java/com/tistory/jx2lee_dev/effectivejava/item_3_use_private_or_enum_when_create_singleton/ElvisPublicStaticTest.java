package com.tistory.jx2lee_dev.effectivejava.item_3_use_private_or_enum_when_create_singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

// https://madplay.github.io/post/what-is-readresolve-method-and-writereplace-method
@Slf4j
class ElvisPublicStaticTest {
    @Test
    void is_singleton() {
        // given
        ElvisPublicStatic instance_1 = ElvisPublicStatic.getInstance();
        ElvisPublicStatic instance_2 = ElvisPublicStatic.getInstance();

        // expected
        assertSame(instance_1, instance_2);
        log.info("\ninstance_1.class={}\ninstance_2.class={}", instance_1, instance_2);
    }

    @Test
    void singleton_when_deserializable() {
        // given
        ElvisPublicStatic elvisPublicStatic = ElvisPublicStatic.getInstance();
        ElvisSerializable serializable = new ElvisSerializable();

        // when
        byte[] serializedElvis = serializable.serialize(elvisPublicStatic);
        ElvisPublicStatic deserializedElvis = (ElvisPublicStatic) serializable.deserialize(serializedElvis);

        // then
        assertSame(deserializedElvis, elvisPublicStatic);
        log.info("\ninstance_1.class={}\ninstance_2.class={}", elvisPublicStatic, deserializedElvis);
    }
}