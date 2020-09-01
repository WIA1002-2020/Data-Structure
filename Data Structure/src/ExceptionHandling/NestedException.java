/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author muham
 */
public class NestedException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ObjectInputStream in;
        try {
            in = new ObjectInputStream(new FileInputStream("binary.dat"));
            System.out.println("Read from binary file");
            try {
                while (true) {
                    System.out.println(in.readUTF());
                }
            } catch (EOFException e) { //catch exception if end of file
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("IO error : " + e.getMessage());
        }
    }
}
