/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

/**
 *
 * @author muham
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //FIRST TEST
        Test1<Integer> a = new Test1<>(100);
        Test1<Double> b = new Test1<>(20.16);
        Test1<String> c = new Test1<>("Introduction to Generic");
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println("");

        //SECOND TEST
        String[] str = {"one", "two", "three"};
        Test2<Integer, String> d = new Test2<>(100, str);
        System.out.println(d.toString());
        System.out.println("");

        //COMPARE
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(1, "ayam");
        boolean same = Util.compare(p1, p2);
        System.out.println(same);
        System.out.println("");

        System.out.println("Max of 3, 4 and 5 is "+ maximum(3, 4, 5));
        System.out.println("Max of 6.6, 8.8 and 7.7 is "+ maximum(6.6, 8.8, 7.7));
        System.out.println("Max of pear, apple and orange is "+ maximum("pear", "apple", "orange"));
    }
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; //assume x is initially the largest      
        if (y.compareTo(max) > 0) {
            max = y; //y is the largest so far
        }
        if (z.compareTo(max) > 0) {
            max = z; //z is the largest now                 
        }
        return max; //returns the largest object   
    }
}
