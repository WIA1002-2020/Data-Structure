/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author muham
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SortTest<Integer> a = new SortTest<>(SortTest.DESCENDING, 1);
        System.out.println("The Integer data set");
        a.showValue();
        System.out.println("Selection Sort - Ascending Order");
        a.selectionSort();
        a.showValue();
        
        SortTest<Integer> b = new SortTest<>(SortTest.ASCENDING, 1);
        System.out.println("\nThe Integer data set");
        b.showValue();
        System.out.println("Bubble Sort - Ascending Order");
        b.bubbleSort();
        b.showValue();
        
        SortTest<Integer> c = new SortTest<>(SortTest.ASCENDING, 1);
        System.out.println("\nThe Integer data set");
        c.showValue();
        System.out.println("Insertion Sort - Ascending Order");
        c.insertionSort();
        c.showValue();
        
        
    }
    
}
