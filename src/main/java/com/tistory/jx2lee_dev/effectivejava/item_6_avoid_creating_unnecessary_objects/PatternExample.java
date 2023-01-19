package com.tistory.jx2lee_dev.effectivejava.item_6_avoid_creating_unnecessary_objects;

import java.util.regex.Pattern;

public class PatternExample {
    /**
     * bad case)
     * Pattern 인스턴스는 한 번 사용하고 GC 대상이기 때문에 인스턴스 생성 비용이 높다. 따라서 피해야 한다.
     **/
    // static boolean isRomanNumeral(String s) {
    //     return s.matches("^(?=.)M*(C[MD]|D?C{0,3})" + "X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    // }

    /**
     * good case)
     * Pattern 인스터스를 초기화 과정에서 직접 생성 -> 캐싱
        * isRomanNumeral 함수 호출 시 초기화에 생성한 인스턴스를 재사용한다. (효율)
        * a.k.a lazy initialization (과하게 사용하면 코드가 복잡해진다)
            * 객체 사용이 불편이라면 안전하다.
     **/
    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})" + "X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$"
    );
    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }
}
