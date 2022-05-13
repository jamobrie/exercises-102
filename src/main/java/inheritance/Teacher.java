package inheritance;

public class Teacher extends Person {

    public Teacher(int age, String name, char gender, String address, int familySize) {
        super(age, name, gender);
    }

    @Override
    public void setAge(int age) {
        super.yearsOld(age);
    }

    public String subjectsToEach(String subject) {
        return "Teacher is specialized in tutoring: " + subject;
    }


}
