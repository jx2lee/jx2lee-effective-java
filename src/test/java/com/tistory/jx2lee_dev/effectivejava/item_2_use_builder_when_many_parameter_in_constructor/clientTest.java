package com.tistory.jx2lee_dev.effectivejava.item_2_use_builder_when_many_parameter_in_constructor;

import com.tistory.jx2lee_dev.effectivejava.item_2_use_builder_when_many_parameter_in_constructor.pizza.Calzone;
import com.tistory.jx2lee_dev.effectivejava.item_2_use_builder_when_many_parameter_in_constructor.pizza.NyPizza;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EnumSet;

import static com.tistory.jx2lee_dev.effectivejava.item_2_use_builder_when_many_parameter_in_constructor.pizza.Pizza.Topping.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class clientTest {
    NyPizza nyPizza;
    Calzone sauceCalzone;
    @BeforeEach
    void init() {
        nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(SAUSAGE)
                .addTopping(HAM).build();
        sauceCalzone = new Calzone.Builder()
                .addTopping(MUSHROOM)
                .sauceInside().build();
    }
    @Test
    void builderTest() {
        // expected
        assertEquals(nyPizza.getClass(), NyPizza.class);
        assertEquals(nyPizza.getToppings(), EnumSet.of(SAUSAGE, HAM));

        assertEquals(sauceCalzone.getClass(), Calzone.class);
        assertEquals(sauceCalzone.getToppings(), EnumSet.of(MUSHROOM));
        assertTrue(sauceCalzone.isSauceInside());
    }
}