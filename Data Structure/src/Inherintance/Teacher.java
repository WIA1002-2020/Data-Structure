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
public class Teacher extends Person{
    private String staffID;

    public Teacher(String name, String staffID) {
        super("Teacher");
        this.name = name;
        this.staffID = staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStaffID() {
        return staffID;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return super.toString() + "Teacher: "+ name +"("+ staffID +")";
    }
    
}
