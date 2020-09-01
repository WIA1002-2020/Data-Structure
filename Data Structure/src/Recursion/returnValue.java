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
public class returnValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(power(3, 3));
        System.out.println(factorial(5));
    }
    
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        else{
            return x*power(x, n-1);
        }
    }
    
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    
}
