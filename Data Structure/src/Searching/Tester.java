/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.Scanner;

/**
 *
 * @author muham
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int key, count;
        SearchTest<Integer> a = new SearchTest<>(1, 10, 69);
        System.out.print("The Integer data set : ");
        a.showValue();
        Scanner s = new Scanner(System.in);
        System.out.println("\nLinear Search");
        System.out.print("Enter a number to search: ");
        key=s.nextInt();
        count=a.linearSearchCount(key);
        if(count!=0){
            System.out.println("The number of "+ key +" in the data set is "+ count);
        }
        else{
            System.out.println(key +" is not found");
        }
        
        SearchTest<Integer> b = new SearchTest<>(1, 10, 69);
        System.out.print("\nThe Integer data set : ");
        b.selectionSort(b.ASCENDING);
        b.showValue();
        System.out.println("\nBinary Search");
        System.out.print("Enter a number to search: ");
        key=s.nextInt();
        count=b.binarySearchCount(key);
        if(count!=0){
            System.out.println("The number of "+ key +" in the data set is "+ count);
        }
        else{
            System.out.println(key +" is not found");
        }
        
        HashTable<String, String> HT = new HashTable<>();
        System.out.println("\nInsert Three Key-Value Pairs into the Hash Table");
        HT.put("A", "Apple");
        HT.put("B", "Boy");
        HT.put("C", "Cat");
        System.out.println("The number of elements in the Hash Table "+ HT.getSize());
        HT.showHashTable();
        System.out.println("\nThe Value for Key B is "+ HT.get("B"));
        System.out.println("Modify the value for key B");
        HT.put("B", "Bird");
        System.out.println("The number of elements in the Hash Table "+ HT.getSize());
        HT.showHashTable();
        System.out.println("\nRemove Key A");
        HT.remove("A");
        System.out.println("The number of elements in the Hash Table "+ HT.getSize());
        HT.showHashTable();
        System.out.println();
        
    }    
}
