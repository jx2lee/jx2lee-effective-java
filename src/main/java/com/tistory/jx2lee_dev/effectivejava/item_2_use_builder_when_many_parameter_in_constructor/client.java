package com.tistory.jx2lee_dev.effectivejava.item_2_use_builder_when_many_parameter_in_constructor;

import com.tistory.jx2lee_dev.effectivejava.item_2_use_builder_when_many_parameter_in_constructor.pizza.Calzone;
import com.tistory.jx2lee_dev.effectivejava.item_2_use_builder_when_many_parameter_in_constructor.pizza.NyPizza;
import com.tistory.jx2lee_dev.effectivejava.item_2_use_builder_when_many_parameter_in_constructor.pizza.Pizza;

public class client {
    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.HAM).build();

        Calzone calzone = new Calzone.Builder()
                .sauceInside()
                .addTopping(Pizza.Topping.MUSHROOM)
                .addTopping(Pizza.Topping.ONION).build();

        System.out.println("nyPizza = " + nyPizza.toString());
        System.out.println("nyPizza.toppings = " + nyPizza);
        System.out.println("calzone = " + calzone.toString());
    }
}
