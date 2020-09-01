/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticVariable;

/**
 *
 * @author muham
 */
public class Desk {
    //declare onetime
    private static int count = 0;
    
    public Desk(){
        count++;
    }
    
    public static int getCount(){
        return count;
    }
}

