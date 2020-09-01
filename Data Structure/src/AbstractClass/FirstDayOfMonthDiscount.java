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
public class FirstDayOfMonthDiscount extends Discount{
    private final double rate = 0.5;
    private double sales;

    public FirstDayOfMonthDiscount(double sales) {
        this.sales = sales;
    }
    
    public double getDiscount(){
        //weekday discount 50%
        return (1-rate)*sales;
    }
    
    public String toString(){
        return "Normal Price (discount 10%): "+ getNormalDiscount(sales) +
                "\nFirst Day of Month (discount 50%): "+ getDiscount();
    }
}

