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
//BASE CLASS
public class Person {  
    private String typeOfPerson;
    protected String name;

    public Person(String typeOfPerson) {
        this.typeOfPerson = typeOfPerson;
    }

    public void setTypeOfPerson(String typeOfPerson) {
        this.typeOfPerson = typeOfPerson;
    }

    public String getTypeOfPerson() {
        return typeOfPerson;
    }
    
    public String toString(){
        return "Type of person : "+ typeOfPerson + "\n";
    }
}
