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
//DERIVED CLASS
public class Student extends Person{    
    private String matric;

    public Student(String name, String matric) {
        super("Student");
        this.name = name;
        this.matric = matric;
    }

    public void setMatric(String matric) {
        this.matric = matric;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatric() {
        return matric;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return super.toString() + "Student: " + name + "("+ matric +")";
    }
    
    
}
