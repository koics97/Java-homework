package occupations;

public class Person {
    private int age;
    private String name;
    private Gender gender;

    public Person() {
    }

    public Person(int age, String name, Gender gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    void introduce(){
        System.out.print("Hi, my name is " + name + ". I am " + age + ". I am a " + gender);
    }
    void printGoal(){
        System.out.println("My goal is to be happy in the future.");
    }
}
