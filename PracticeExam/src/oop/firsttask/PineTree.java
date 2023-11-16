package oop.firsttask;

public class PineTree extends Tree{
    public PineTree() {
    }

    public PineTree(String name, int age, int height) {
        super(name, age, height);
    }

    @Override
    public String getDescription() {
        return "Tűlevelei vannak, termése a toboz. " +
                "Neve: " + getName() + ", életkora: " + getAge() + " év, magassága: " + getHeight() + "m.";
    }

    @Override
    public String getHungarianName() {
        return "fenyőfa";
    }

    @Override
    public void bloom() {
        System.out.println("A " + getHungarianName() + " virágzik");
    }
}
