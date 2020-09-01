/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.Scanner;

/**
 *
 * @author muham
 */
public class SingleTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        System.out.println("Linked List : Insert 3 nodes at the back");
        //insert nodes at the back
        list.addNode("One");
        list.addNode("Two");
        list.addNode("Three");
        System.out.println("Linked List has "+ list.length() +" nodes");
        list.showList();
        
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter a String to search : ");
        String str = s.nextLine();
        if(list.contains(str)){
            System.out.println(str +" was found");
        }
        else{
            System.out.println(str +" was not found");
        }
        System.out.println("Linked List : Delete 2 nodes at the back");
        //delete nodes at the back
        list.deleteNode();
        list.deleteNode();
        System.out.println("Linked List has "+ list.length() +" nodes");
        list.showList();
        System.out.println("\nLinked List : Clear ALL");
        //clear all nodes
        list.clear();
        System.out.println("Linked List has "+ list.length() +" nodes");
        System.out.println();
        
        LinkedList<String> a = new LinkedList<>();
        System.out.println("Linked List : Insert 3 front nodes");
        //insert nodes at the front
        a.addFrontNode("One");
        a.addFrontNode("Two");
        a.addFrontNode("Three");
        System.out.println("Linked List has "+ a.length() +" nodes");
        a.showList();
        System.out.println("\nLinked List : Delete 2 front nodes");
        //delete nodes at the front
        a.deleteFrontNode();
        a.deleteFrontNode();
        System.out.println("Linked List has "+ a.length() +" nodes");
        a.showList();
        System.out.println();
        
        LinkedList<String> b = new LinkedList<>();
        System.out.println("\nLinked List : Insert 4 nodes at the back");
        //insert nodes at the back
        b.addNode("One");
        b.addNode("Two");
        b.addNode("Three");
        b.addNode("Four");
        System.out.println("Linked List has "+ b.length() +" nodes");
        b.showList();
        int position = 1;
        System.out.println("\nLinked List Position start at 0");
        System.out.println("Insert a node position : "+ position);
        b.addNodeByPosition("Five", position);
        System.out.println("Linked List has "+ b.length() +" nodes");
        b.showList();
        position = 2;
        System.out.println("\nDelete a node from position : "+ position);
        b.deleteNodeByPosition(position);
        System.out.println("Linked List has "+ b.length() +" nodes");
        b.showList();
        System.out.println();
        
        LinkedList<String> c = new LinkedList<>();
        System.out.println("\nLinked List : Insert 4 nodes at the back");
        //insert nodes at the back
        c.addNode("One");
        c.addNode("Two");
        c.addNode("Three");
        c.addNode("Four");
        System.out.println("Linked List has "+ c.length() +" nodes");
        c.showList();
        System.out.println("\nLinked List Position start at 0");
        String newValue = "Five";
        position = 2;
        System.out.println("Change value at position : "+ position + " to "+ newValue);
        c.set(newValue, position);
        System.out.println("Linked List has "+ c.length() +" nodes");
        c.showList();
        position = 1;
        System.out.println("\nThe value at position : "+ position + " is "+ c.get(position));
    }
    
}
