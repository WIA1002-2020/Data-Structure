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
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sales = 310;
        double pay = 400;
        WeekEndDiscount a = new WeekEndDiscount(sales, pay);
        FirstDayOfYear b = new FirstDayOfYear(sales, pay);
        System.out.println("Original Price : "+ sales);
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
    
}
