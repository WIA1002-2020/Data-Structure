/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inherintance;

/**
 *
 * @author muham
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teacher a = new Teacher("Amrin", "ID1300");
        Student b = new Student("Amir", "1900");
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println("They are " + a.getTypeOfPerson() + " and " + b.getTypeOfPerson());
        System.out.println("");
        
        //POLYMORPHISM
        Teacher c = new Teacher("Amrin", "ID1300");
        Student d = new Student("Amir", "1900");
        display(c);
        display(d);
        System.out.println("They are " + getType(c) + " and " + getType(d));
    }
    public static void display(Person a) {
        System.out.println(a.toString());
    }
    public static String getType(Person a) {
        return a.getTypeOfPerson();
    }
}
