/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author muham
 */
public class SingleException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        while (true) {
            try {
                System.out.print("Please enter an integer number : ");
                num = s.nextInt();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Invalid Input Type");
                s.nextLine();
            }
        }
        System.out.println("The integer is " + num);
        System.out.println("");

        String[] str = {"test", "12.34", "56", "A"};
        for (int i = 0; i < str.length; i++) {
            checkType(str[i]);
        }
    }

    public static void checkType(String a) {
        if (isInteger(a)) {
            System.out.println(a + " is an integer");
        } 
        else {
            System.out.println(a + " is not an integer");
        }
    }

    public static boolean isInteger(String a) {
        try {
            Integer.parseInt(a);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
