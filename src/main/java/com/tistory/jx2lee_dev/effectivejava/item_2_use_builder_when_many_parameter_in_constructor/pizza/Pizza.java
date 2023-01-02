package com.tistory.jx2lee_dev.effectivejava.item_2_use_builder_when_many_parameter_in_constructor.pizza;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
    public enum Topping {
        HAM, MUSHROOM, ONION, PEPPER, SAUSAGE
    }
    final Set<Topping> toppings;

    public Set<Topping> getToppings() {
        return toppings;
    }

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();
        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
