package dev.dumitru.enums.classwork;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(Male.MALE);
        Cat cat2 = new Cat(Male.FEMALE);
        Cat cat3 = new Cat(Male.MALE);
        Cat cat5 = new Cat(Male.MALE);

        Cat[] cats = {cat1, cat2, cat3, cat5};
        List<Cat> catList = Arrays.asList(cats);

//        for (Cat cat : catList) {
//            switch (cat.getMale()) {
//                case MALE -> System.out.println("Male");
//                case FEMALE -> System.out.println("Female");
//            }
//        }
//        for (Cat cat : cats) {
//            switch (cat.getMale()) {
//                case MALE -> System.out.println("Male");
//                case FEMALE -> System.out.println("Female");
//            }
//        }

        Iterator<Cat> iterator = catList.listIterator();
        while (iterator.hasNext()) {
            Cat cat = iterator.next();
            switch (cat.getMale()) {
                case MALE -> System.out.println("Male");
                case FEMALE -> System.out.println("Female");
            }
        }

        System.out.println("****");
        for (Cat cat : catList) {
            System.out.println(cat.getMale().getRussianMaleTittle());
        }

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Run");
            }
        };

        Runnable runnable2 = () -> System.out.println("Run");

        runnable.run();
        runnable2.run();

        BiFunction<Integer, Integer, String> biFunction =
                new BiFunction<Integer, Integer, String>() {
            @Override
            public String apply(Integer a, Integer b) {
                return String.format("%d + %d = %d", a, b, a+b);
            }
        };
        System.out.println(biFunction.apply(1, 2));

        BiFunction<Integer, Integer, String> biFunction2 = (a, b) -> String.format("%d + %d = %d", a, b, a+b);
        System.out.println(biFunction2.apply(3, 4));


    }
}
