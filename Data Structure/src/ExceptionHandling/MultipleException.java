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
public class MultipleException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        while(true){
            try{
                System.out.print("Please enter an integer number in between 0 - 20 : ");
                num=s.nextInt();
                if(num<0||num>20)
                    throw new Exception("The integer must be in between 0 - 20");
                break;
            }catch(InputMismatchException ex){
                System.out.println("Invalid input type");
                s.nextLine();
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("The integer is "+ num);
    }
    
}
