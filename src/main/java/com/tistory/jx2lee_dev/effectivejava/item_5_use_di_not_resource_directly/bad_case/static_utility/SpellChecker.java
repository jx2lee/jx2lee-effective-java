package com.tistory.jx2lee_dev.effectivejava.item_5_use_di_not_resource_directly.bad_case.static_utility;

import com.tistory.jx2lee_dev.effectivejava.item_5_use_di_not_resource_directly.bad_case.KoreanDictionary;
import com.tistory.jx2lee_dev.effectivejava.item_5_use_di_not_resource_directly.bad_case.Lexicon;

public class SpellChecker {
    private static final Lexicon dictionary = new KoreanDictionary();

    private SpellChecker() {
    }

    public void isValid(String word) {
        // ...
    }

    public void suggestions(String typo) {
        // ...
    }
}