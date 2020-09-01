/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractDataTypes;

/**
 *
 * @author muham
 */
public class Q1Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Q1ArrayLog<Integer> a = new Q1ArrayLog<>(10);
        a.insert(20);
        a.insert(15);
        a.insert(13);
        System.out.println("Log size "+ a.size());
        System.out.println(a.toString());
        
        int num = 15;
        if(a.search(num)){
            System.out.println("Log contains "+ num);
        }
        else{
            System.out.println("Log does not contains "+ num);
        }
        
        Q1ArrayLog<String> b = new Q1ArrayLog<>(10);
        b.insert("James");
        b.insert("Ahmad");
        b.insert("Siti");
        b.insert("Ramesh");
        b.insert("John");
        b.insert("Abdullah");
        System.out.println(a.toString());
        
        String name = "Siti";
        if(b.search(name)){
            System.out.println("Log contains "+ name);
        }
        else{
            System.out.println("Log does not contains "+ name);
        }
        b.clear();
        System.out.println("Log size "+ b.size());       
    }  
}
