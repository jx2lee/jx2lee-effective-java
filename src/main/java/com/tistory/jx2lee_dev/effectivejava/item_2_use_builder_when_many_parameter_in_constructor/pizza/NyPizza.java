package com.tistory.jx2lee_dev.effectivejava.item_2_use_builder_when_many_parameter_in_constructor.pizza;

import java.util.Objects;

public class NyPizza extends Pizza {
    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    final Size size;

    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    @Override
    public String toString() {
        return "NyPizza{" +
                "size=" + size +
                ", toppings=" + toppings +
                '}';
    }
}
