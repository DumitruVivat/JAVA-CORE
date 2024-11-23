package dev.dumitru.cat;

public class Cat {
    private static final int CURRENT_YEAR = 2024;
    private static int id = 0;

    private String name;
    private String color;
    private int birthYear;
    public int uid;

    public Cat(String name, String color, int age) {
        setBirth(age);
        this.name = name;
        this.color = color;
        this.uid = ++id;
    }

    private void setBirth(int age) { this.birthYear = CURRENT_YEAR - age; }
    public int getUid() { return uid; }
    public String getColor() { return color; }
    public int getAge() { return CURRENT_YEAR - birthYear; }
    public String getName() { return name; }

    public String getInfo() {
        return "Кот " + name + ", цвет: " + color + ", возраст: " + getAge() + " лет, UID: " + uid;
    }
}
