package oop.firsttask;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Tree oakTree = new OakTree("Joseph",20,5);
        Tree oakTree2 = new OakTree("Joseph",20,5);
        Tree oakTree3 = new OakTree("Joseph", 20, 5);
        Tree pineTree = new PineTree("George", 12, 8);
        Tree pineTree2 = new PineTree("George",12,8);
        Tree pineTree3 = new PineTree("George", 12, 8);
        Tree cherryTree = new CherryTree("Sherry", 13,5);
        Tree cherryTree2 = new CherryTree("Sherry", 13,5);
        Tree cherryTree3 = new CherryTree("Sherry", 13,5);
        Tree mapleTree = new MapleTree("Maple",8,7);
        Tree mapleTree2 = new MapleTree("Maple",8,7);
        Tree mapleTree3 = new MapleTree("Maple",8,7);

        List<Tree> treeList = new ArrayList<>();
        treeList.add(oakTree);
        treeList.add(oakTree2);
        treeList.add(oakTree3);
        treeList.add(mapleTree);
        treeList.add(mapleTree2);
        treeList.add(mapleTree3);
        treeList.add(pineTree);
        treeList.add(pineTree2);
        treeList.add(pineTree3);

        Set<Tree> treeSet = new HashSet<>();
        treeSet.add(oakTree);
        treeSet.add(oakTree2);
        treeSet.add(oakTree3);
        treeSet.add(cherryTree);
        treeSet.add(cherryTree2);
        treeSet.add(cherryTree3);
        treeSet.add(mapleTree);
        treeSet.add(mapleTree2);
        treeSet.add(mapleTree3);
        treeSet.add(pineTree);
        treeSet.add(pineTree2);
        treeSet.add(pineTree3);

        for (Tree trees:treeSet) {
            System.out.println(trees);
        }
        System.out.println("Lista:");
        for(Tree tree:treeList){
            System.out.println(tree);
            System.out.println(tree.getHungarianName());
            System.out.println(tree.getDescription());
            tree.bloom();
        }
    }
}
