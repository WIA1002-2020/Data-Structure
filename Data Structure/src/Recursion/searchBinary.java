/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author muham
 */
public class searchBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {1,5,9,12,15,21,29,31};
        System.out.println(binarySearch(a,0,a.length-1,30));
        
    }
    public static int binarySearch(int[] a, int first, int last, int key){
        int index;
        if(first > last){
            return -1;
        }
        else{
            int mid = (first + last)/2;
            if(key == a[mid]){
                index = mid;
            }
            else if(key < a[mid]){
                index = binarySearch(a, first, mid-1, key);
            }
            else{
                index = binarySearch(a, mid+1, last, key);
            }
            return index;
        }
    }
    
}
