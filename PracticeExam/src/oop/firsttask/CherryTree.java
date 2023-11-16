package oop.firsttask;

public class CherryTree extends Tree{
    public CherryTree() {
    }

    public CherryTree(String name, int age, int height) {
        super(name, age, height);
    }

    @Override
    public String getDescription() {
        return "Normál erezetes levelei vannak, termése a cseresznye. " +
                "Neve: " + getName() + ", életkora: " + getAge() + " év, magassága: " + getHeight() + "m.";
    }

    @Override
    public String getHungarianName() {
        return "cseresznyefa";
    }

    @Override
    public void bloom() {
        System.out.println("A " + getHungarianName() + " virágzik");
    }
}
