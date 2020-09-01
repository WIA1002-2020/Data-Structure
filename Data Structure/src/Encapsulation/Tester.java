/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author muham
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //OBJECT CREATION
        Student a = new Student();
        a.setName("Ikhwan");
        a.setMatric("WIC190025");
        System.out.println(a.toString());
        Student b = new Student("Iman", "WIK180296");
        System.out.println(b.toString());
        System.out.println("List of students matric number :");
        System.out.println("1. " + a.getMatric());
        System.out.println("2. " + b.getMatric());
        System.out.println();
        
        //ARRAY OF OBJECT CREATION
        String[] name = {"Ikhwan","Iman","Aman"};
        String[] matric = {"1900","1800","1700"};        
        Student[] C = new Student[3];
        for (int i = 0; i < C.length; i++) {
            C[i] = new Student(name[i],matric[i]);
        }
        System.out.println("List of students :");
        for (int i = 0; i < C.length; i++) {
            System.out.println((i+1) +". "+ C[i].toString());
        }
        System.out.println("List of student matric :");
        for (int i = 0; i < C.length; i++) {
            System.out.println((i+1) +". "+ C[i].getMatric());           
        }
    }
    
}
