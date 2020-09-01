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
public class TowerOfHanoi {
    private static String indent = "";
    
    public static void tower(int n, String start, String temp, String end){
        if(n>0){
            indent += "  ";
            System.out.println(indent +"Get "+ n +" rings moved from "+ start + " to "+ end);
            tower(n-1, start, end, temp);
            System.out.println(indent +"Move rings "+ n +" from "+ start +" to "+ end);
            tower(n-1, temp, start, end);
            indent = indent.substring(2);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tower(5, "Source", "Temporary", "Destination");
    }
    
    
}
