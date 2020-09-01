/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author muham
 */
public class voidMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        displayDigit(34567);
        reverse("hellowim", 8);
        
    }
    
    public static void displayDigit(int n){
        if(n<10){
            System.out.println(n);
        }
        else{
            displayDigit(n/10);
            System.out.println(n%10);
        }
    }
    
    public static void reverse(String s, int size){
        if(size==1){
            System.out.println(s.charAt(size-1));
        }
        else{
            System.out.println(s.charAt(size-1));
            reverse(s,--size);
        }
    }
    
}
