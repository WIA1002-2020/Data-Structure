/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author muham
 */
//NOT DONE YET
public class Finally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("num.txt"));
            System.out.println("Write to text file");
            for (int i = 0; i < str.length; i++) {
                System.out.println(str[i]);
                out.println(str[i]);
            }
            out.close();
        } catch (IOException e) {
            System.out.println("IO error : " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter if not yet closed");
                out.close();
            }
        }
    }

}
