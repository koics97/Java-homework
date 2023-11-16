package oop.firsttask;

import java.util.Objects;

public abstract class Tree {
    private String name;
    private int age;
    private int height;

    public Tree(){

    }

    public Tree(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public abstract String getDescription();

    public abstract String getHungarianName();

    public abstract void bloom();

    @Override
    public String toString() {
        return "Egy " + age + " éves " + name + " nevű fa virágzik";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return age == tree.age && height == tree.height && Objects.equals(name, tree.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }
}
