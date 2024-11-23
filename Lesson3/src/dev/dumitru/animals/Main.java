package dev.dumitru.animals;

public class Main {
    public static void main(String[] args) {

        Cat c = new Cat("Barseek");
        Cat c0 = new Cat("Moorzeek");
        Dog d = new Dog("Toozeek", 0.5f, 500, 10);
        Dog  d0 = new Dog("Shaareek", 0.5f, 500, 10);

        Animal[] animals = {c, c0, d, d0};
        float toJump = 1.5f;
        float toRun = 350;
        float toSwim = 5;

        for (int i = 0; i < animals.length; i++) {
            String nameString = animals[i].getType() + " " + animals[i].getName() + " can ";

            String eventName = String.format("jump max %.2fm. Tries to jump ", animals[i].getMaxJump());
            String eventResult = (animals[i].jump(toJump)) ? "succeed" : "fails";
            System.out.println(nameString + eventName + toJump + "m and " + eventResult);

            eventName = String.format("run max %.2fm. Tries to run ", animals[i].getMaxRun());
            eventResult = animals[i].run(toRun) ? "succeed" : "fails";
            System.out.println(nameString + eventName + toRun + "m and " + eventResult);

            int swimResult = animals[i].swim(toSwim);
            eventName = String.format("swim max %.2fm. Tries to swim ", animals[i].getMaxSwim());
            eventResult = (swimResult == Animal.SWIM_OK) ? "succeed" : "fails";
            if (swimResult == Animal.SWIM_WTF) {
                eventResult = "too scared to enter the water";
                System.out.println(nameString + eventName + toSwim + "m and " + eventResult);
            }
        }
    }
}
