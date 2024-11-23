package dev.dumitru.animals;

public class Cat extends Animal {
    public Cat(String name) {
        super("Cat", name, 2, 200, 1);

    }

    @Override
    protected int swim(float distance) {
        return Animal.SWIM_WTF;
    }
}
