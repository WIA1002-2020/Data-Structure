/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.util.Scanner;

/**
 *
 * @author muham
 */
public class ExceptionMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1, num2;
        while (true) {
            try {
                System.out.print("Enter two integer : ");
                num1 = s.nextInt();
                num2 = s.nextInt();
                System.out.println(num1 + " / " + num2 + " = " + compute(num1, num2));
                break;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static int compute(int a, int b) throws ArithmeticException{
        return a/b;
    }

}
