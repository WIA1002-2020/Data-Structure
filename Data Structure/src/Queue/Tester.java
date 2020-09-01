/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author muham
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<Integer> a = new Queue<>();
        System.out.println("Insert three nodes into the queue");
        a.enqueue(4);
        a.enqueue(3);
        a.enqueue(6);
        a.enqueue(5);
        a.enqueue(9);
        a.showQueue();
        System.out.println("\nThe queue size is "+ a.getSize());
        System.out.println("Remove one node from the queue");
        a.dequeue();
        a.showQueue();
        System.out.println("\nThe queue size is "+ a.getSize());
        System.out.println("The value of the front node is "+ a.peek());
        System.out.println("The queue size is "+ a.getSize());
    }
    
}
