package dev.dumitru.enums.classwork;

public enum Male {
    MALE("маличик"), FEMALE("девочика");

    private final String russianMaleTittle;

    Male(String russianMaleTittle) {
        this.russianMaleTittle = russianMaleTittle;
    }

    public String getRussianMaleTittle() {
        return russianMaleTittle;
    }

    @Override
    public String toString() {
        return name();
    }

//    abstract void test();
}
