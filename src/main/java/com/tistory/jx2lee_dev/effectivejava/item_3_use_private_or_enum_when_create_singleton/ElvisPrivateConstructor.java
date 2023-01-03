package com.tistory.jx2lee_dev.effectivejava.item_3_use_private_or_enum_when_create_singleton;

import java.io.Serializable;

// https://velog.io/@lychee/이펙티브-자바-아이템-3.-private-생성자나-열거-타입으로-싱글턴임을-보증하라
public class ElvisPrivateConstructor implements Serializable {
    public static final ElvisPrivateConstructor INSTANCE = new ElvisPrivateConstructor();
    private ElvisPrivateConstructor() {
    }
}
