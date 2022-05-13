package inheritanceAnimal.inheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();

        Fish fish = new Fish("Mackrel", 2, 4, 2, 2, 2);
        System.out.println("my fishy is: " + fish);
        fish.swim(22);


    }
}

