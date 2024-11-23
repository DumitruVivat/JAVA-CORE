package dev.dumitru.cat;

public class CatMain {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", "Белый", 3);
        Cat cat2 = new Cat("Мурка", "Черный", 5);
        Cat cat3 = new Cat("Том", "Серый", 2);


        System.out.println(cat1.getInfo());
        System.out.println(cat2.getInfo());
        System.out.println(cat3.getInfo());
    }
}
