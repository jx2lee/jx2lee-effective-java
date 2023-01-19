package com.tistory.jx2lee_dev.effectivejava.item_6_avoid_creating_unnecessary_objects;

public class GetString {
    // avoid below
    // private static final String newString = new String("string");
    private static final String str = new String("string");
    private GetString() {
        throw new AssertionError();
    }

    public static String getStr() {
        return str;
    }

}
