/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Random;

/**
 *
 * @author muham
 */
public class Blobs {

    private static boolean[][] blob, visited;
    private static int size;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //generate blobs
        Random r = new Random();
        int count = 0, percentage = 33;
        size = 10;
        blob = new boolean[size][size];
        int randnum;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                randnum = r.nextInt(100);
                if (randnum < percentage) {
                    blob[i][j] = true;
                } else {
                    blob[i][j] = false;           
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (blob[i][j]) {
                    System.out.print("@ ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        
        //count blobs
        visited = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                visited[i][j] = false;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(blob[i][j] && !visited[i][j]){
                    count++;
                    markBlob(i, j);
                }
            }
        }
        System.out.println("Number of blob "+ count);
    }
    
    public static void markBlob(int row, int col){
        visited[row][col] = true;
        //check above
        if((row-1) >= 0){
            if(blob[row-1][col]){
                if(!visited[row-1][col]){
                    markBlob(row-1, col);
                }
            }
        }
        //check below
        if((row+1)<size){
            if(blob[row+1][col]){
                if(!visited[row+1][col]){
                    markBlob(row+1, col);
                }
            }
        }
        //check left
        if((col-1)>=0){
            if(blob[row][col-1]){
                if(!visited[row][col-1]){
                    markBlob(row, col-1);
                }
            }
        }
        //check right
        if((col+1)<size){
            if(blob[row][col+1]){
                if(!visited[row][col+1]){
                    markBlob(row, col+1);
                }
            }
        }
    }

}
