package abstraction.exercise1;

public class Main {

    public static void main(String[] args) {
        Dog molly = new Dog("Molly");
        molly.breath();
        molly.eat();

        Pigeon pigeon = new Pigeon("Stupid Pigeon");
        pigeon.fly();
        pigeon.breath();
        pigeon.eat();
    }


}
