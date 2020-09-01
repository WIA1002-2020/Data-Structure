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
public class EmptyInputException extends Exception{
    public EmptyInputException(){
        super("Empty Input Exception");
    }
    public EmptyInputException(String s){
        super(s);
    }
    
    public static void main(String[] args) {
        try{
            String s;
            Scanner k = new Scanner(System.in);
            System.out.print("Enter a sentence : ");
            s=k.nextLine();
            if(s.equals(""))
                throw new EmptyInputException("Empty String is Entered");
        }catch(EmptyInputException e){
            System.out.println(e.getMessage());
        }
    }
}

