package com.tistory.jx2lee_dev.effectivejava.item_2_use_builder_when_many_parameter_in_constructor.pizza;

import java.util.EnumSet;
import java.util.Set;

public class Calzone extends Pizza {

    final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false; // default value.

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        public Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

    @Override
    public String toString() {
        return "Calzone{" +
                "sauceInside=" + sauceInside +
                ", toppings=" + toppings +
                '}';
    }

    public boolean isSauceInside() {
        return sauceInside;
    }
}
