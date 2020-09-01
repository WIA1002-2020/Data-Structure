/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author muham
 */
public class DoubleTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoubleLinkedList<String> list = new DoubleLinkedList<>();
        System.out.println("Double Linked List : Insert 3 nodes at right site");
        list.addRightNode("One");
        list.addRightNode("Two");
        list.addRightNode("Three");
        System.out.println("Double Linked List has "+ list.length() +" nodes");
        list.showList();
        System.out.println("\nDouble Linked List : Delete 2 nodes from right site");
        list.deleteRightNode();
        list.deleteRightNode();
        System.out.println("Double Linked List has "+ list.length() +" nodes");
        list.showList();
        System.out.println();
        
        DoubleLinkedList<String> a = new DoubleLinkedList<>();
        System.out.println("\nDouble Linked List : Insert 3 nodes at right site");
        a.addRightNode("One");
        a.addRightNode("Two");
        a.addRightNode("Three");
        System.out.println("Double Linked List has "+ a.length() +" nodes");
        a.showList();
        int position = 1;
        System.out.println("\nDouble Linked List Position start at 0");
        System.out.println("Insert a node at position : "+ position);
        a.addNodeByPosition("Four", position);
        System.out.println("Double Linked List has "+ a.length() +" nodes");
        a.showList();
        position = 2;
        System.out.println("\nDelete a node from position : "+ position);
        a.deleteNodeByPosition(position);
        System.out.println("Double Linked List has "+ a.length() +" nodes");
        a.showList();
    }
    
}
