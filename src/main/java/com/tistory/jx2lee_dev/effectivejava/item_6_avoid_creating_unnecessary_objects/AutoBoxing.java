package com.tistory.jx2lee_dev.effectivejava.item_6_avoid_creating_unnecessary_objects;

public class AutoBoxing {
    // sum 변수를 Long 타입(박싱된 기본 타입) 으로 선언하였기 때문에 불필요한 Long 인스턴스가 다수 생성됨
    // 박싱된 기본타입 보단 기본 타입을 사용하고, 의도치 않은 오토박싱이 숨어들지 않도록 하자.
    public static long sumLong() {
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }

    public static long sumPrimitiveType() {
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }
}
