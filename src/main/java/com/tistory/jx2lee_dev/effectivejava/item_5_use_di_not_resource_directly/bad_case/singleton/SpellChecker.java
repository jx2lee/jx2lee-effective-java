package com.tistory.jx2lee_dev.effectivejava.item_5_use_di_not_resource_directly.bad_case.singleton;

import com.tistory.jx2lee_dev.effectivejava.item_5_use_di_not_resource_directly.bad_case.KoreanDictionary;
import com.tistory.jx2lee_dev.effectivejava.item_5_use_di_not_resource_directly.bad_case.Lexicon;

public class SpellChecker {
    private final Lexicon dictionary = new KoreanDictionary();

    private SpellChecker() {
    }

    public static final SpellChecker INSTANCE = new SpellChecker();

    public void isValid(String word) {
        // ...
    }

    public void suggestions(String typo) {
        // ...
    }
}
