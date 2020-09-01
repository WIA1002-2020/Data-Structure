/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree;

import java.util.Random;

/**
 *
 * @author muham
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int MAX = 20, SIZE = 10;
        int[] num = new int[SIZE];
        Random r = new Random();
        BST<Integer> tree = new BST<>();
        System.out.println("Insert "+ SIZE +" random numbers within 0 - "+
                            MAX +" into the Binary Search Tree");
        System.out.print("The random numbers are : ");
        for(int i=0; i<num.length; i++){
            num[i] = r.nextInt(MAX+1);
            tree.addNode(num[i]);
            System.out.print(num[i] +" ");
        }
        System.out.println("\nThe number of elements in the tree : "+ tree.getSize());
        System.out.println("Create Balance Tree");
        tree.balance();
        System.out.print("The tree elements - INORDER : ");
        tree.setOrder(BST.INORDER);
        tree.showTree();
        System.out.print("\nThe tree elements - PREORDER : ");
        tree.setOrder(BST.PREORDER);
        tree.showTree();
        System.out.print("\nThe tree elements - POSTORDER : ");
        tree.setOrder(BST.POSTORDER);
        tree.showTree();
        System.out.println("");
    }
    
}
