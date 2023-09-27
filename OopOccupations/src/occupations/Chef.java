package occupations;

public class Chef extends Person{

    public Chef(int age, String name, Gender gender) {
        super(age, name, gender);
    }
    public Chef() {
        super();
    }

    void cook(String food){
        System.out.println(getName() + " has cooked some " + food);
    }

    @Override
    void introduce(){
        super.introduce();
        System.out.println(" and a chef.");
    }
}
