package occupations;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(25, "Jack",Gender.MAN);
        Chef chef = new Chef(20, "Tracey",Gender.WOMAN);
        Person person2 = new Chef(24,"John",Gender.UNDEFINED);
        Chef chef2 = new Chef();

        person.introduce();
        System.out.println();
        person.printGoal();
        System.out.println();
        chef.introduce();
        chef.printGoal();
        chef.cook("fish and chips");
        person2.introduce();
        person2.printGoal();
        chef2.introduce();
        chef2.cook("tomato soup");
        chef2.printGoal();

    }
}
