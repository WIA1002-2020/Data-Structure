/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClass;

/**
 *
 * @author muham
 */
//abstract class
public abstract class Discount {
    private final double rate = 0.1;
    
    //concrete method
    public double getNormalDiscount(double sales){
        //normal discount 10%
        return (1-rate)*sales;
    }
    
    //abstract method
    public abstract double getDiscount();
}


