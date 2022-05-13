package inheritance;

public class Person {

    private double salary;

    public Person(int age, String name, char gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    protected void isMale() {

    }

    protected int yearsOld(int yearsOld) {
        return yearsOld;
    }

    protected double isAlive() {
        return salary;
    }

    private void setSalary(double salary){
        this.salary = salary;
    }

    private int age;
    private String name;
    private char gender;

    public int getAge(int age) {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public char getGender() {
        return this.gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
