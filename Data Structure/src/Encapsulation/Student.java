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
//CLASS DEFINITION
public class Student {   
    private String name, matric;

    public Student(){
        name = "";
        matric = "";
    }

    public Student(String name, String matric) {
        this.name = name;
        this.matric = matric;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMatric(String matric) {
        this.matric = matric;
    }

    public String getName() {
        return name;
    }

    public String getMatric() {
        return matric;
    }
    
    public String toString(){
        return "Student : " + name + "(" + matric + ")";
    }
}
