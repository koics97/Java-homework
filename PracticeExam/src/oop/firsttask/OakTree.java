package oop.firsttask;

public class OakTree extends Tree{
    public OakTree() {
    }

    public OakTree(String name, int age, int height) {
        super(name, age, height);
    }

    @Override
    public String getDescription() {
        return "Fura hullámos levelei vannak, termése a makk. " +
                "Neve: " + getName() + ", életkora: " + getAge() + " év, magassága: " + getHeight() + "m.";
    }

    @Override
    public String getHungarianName() {
        return "tölgyfa";
    }

    @Override
    public void bloom() {
        System.out.println("A " + getHungarianName() + " virágzik");
    }
}
