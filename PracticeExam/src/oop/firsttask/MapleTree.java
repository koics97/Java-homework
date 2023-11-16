package oop.firsttask;

public class MapleTree extends Tree{
    public MapleTree() {
    }

    public MapleTree(String name, int age, int height) {
        super(name, age, height);
    }

    @Override
    public String getDescription() {
        return "Jellegzetes csúcsos levelei vannak." +
                "Neve: " + getName() + ", életkora: " + getAge() + " év, magassága: " + getHeight() + "m.";
    }

    @Override
    public String getHungarianName() {
        return "juharfa";
    }

    @Override
    public void bloom() {
        System.out.println("A " + getHungarianName() + " virágzik");
    }

    @Override
    public String toString() {
        return getName() + " levele Kanada zászlaján megtalálható";
    }
}
