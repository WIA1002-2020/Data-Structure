/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractDataTypes;

/**
 *
 * @author muham
 */
public interface SimpleLog<T> {
    //insert item to the log
    public void insert(T t);
    
    //check whether the log is full
    public boolean isFull();
    
    //get the size of the log
    public int size();
    
    //check whether the item exists in the log
    public boolean search(T t);
    
    //delete the log
    public void clear();
    
    //display all items in the log
    public String toString();

}
