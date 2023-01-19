package com.tistory.jx2lee_dev.effectivejava.item_6_avoid_creating_unnecessary_objects;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import static org.junit.jupiter.api.Assertions.*;

class AutoBoxingTest {
    // Boxing 타입으로 연산한 시간은 기본 타입으로 연산 대비 약 4배 정도 느리다.
    @Test
    void checkRunningTimeBoxingType() {
        long start = System.currentTimeMillis();
        AutoBoxing.sumLong();
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
    }

    @Test
    void checkRunningTimePrimitiveType() {
        long start = System.currentTimeMillis();
        AutoBoxing.sumPrimitiveType();
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
    }
}