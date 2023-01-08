package com.tistory.jx2lee_dev.effectivejava.item_5_use_di_not_resource_directly;

import com.tistory.jx2lee_dev.effectivejava.item_5_use_di_not_resource_directly.bad_case.Lexicon;

import java.util.Objects;

public class SpellChecker {
    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public void isValid(String word) {
        // ...
    }

    public void suggestions(String typo) {
        // ...
    }
}
