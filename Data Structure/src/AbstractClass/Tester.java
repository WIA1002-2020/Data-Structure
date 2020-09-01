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
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sales = 340.2;
        WeekDayDiscount a = new WeekDayDiscount(sales);
        FirstDayOfMonthDiscount b = new FirstDayOfMonthDiscount(sales);
        System.out.println("Original Price : "+ sales);
        display(a);
        display(b);
        
    }
    
    public static void display(Discount p){
        System.out.println(p.toString());
    }
    
}
