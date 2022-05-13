package abstraction.exercise1;

public abstract class Animal {

    public String name;

    public abstract void eat();

    public abstract void breath();

    public void excrete() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
