/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author muham
 */
public class WeekEndDiscount implements Payment { 
    private final double rate = 0.15;
    private double sales, payment;

    public WeekEndDiscount(double sales, double payment) {
        this.sales = sales;
        this.payment = payment;
    }
    
    public double getDiscount(){
        //weekday discount 15%
        return (1-rate)*sales;
    }
    
    public double getBalance(){
        return payment - getDiscount();
    }
    
    public String toString(){
        return "Total Price after 15% discount : "+ getDiscount() +
                "\nTotal Payment : "+ payment +
                "\nBalance : "+ getBalance();
    }
}


