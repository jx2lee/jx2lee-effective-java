package com.tistory.jx2lee_dev.effectivejava.item_3_use_private_or_enum_when_create_singleton;

public enum ElvisEnum {
    INSTANCE;

    public String getName() {
        return "Elvis";
    }
}
