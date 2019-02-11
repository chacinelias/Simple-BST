package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    Random rand = new Random();
        BST myTree = new BST(15);

        for (int i = 0; i < 30; i++) {

            myTree.insert(rand.nextInt(30) + 1);
        }

        myTree.printInOrder();
        System.out.println("--------------");

        int to_find = 16;
        System.out.println("the tree contains " + to_find + "? " + myTree.findValue(to_find));
    }
}
