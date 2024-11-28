package chapter2.item02;

import static chapter2.item02.Pizza.Topping.MUSHROOM;
import static chapter2.item02.Pizza.Topping.ONION;
import static chapter2.item02.Pizza.Topping.PEPPER;
import static chapter2.item02.Pizza.Topping.SAUSAGE;

import chapter2.item02.NyPizza.Builder;
import chapter2.item02.NyPizza.Size;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE};
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>>{
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        protected abstract T self();
    }

    Pizza(Builder<?> builder){
        toppings = builder.toppings.clone();
    }

    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(Size.SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();

        Calzone calzone = new Calzone.Builder()
                .sauceInside().addTopping(MUSHROOM).addTopping(PEPPER).build();
    }
}
