/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author muham
 */
public class bankSimulation2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] name = {"Ahmad", "Syakir", "Chong", "Kumar", "Ali"};
        int[] arrive = {1, 2, 2, 4, 6};
        int time = 0, cnt1 = 0, cnt2 = 0, serviceTime = 3, n = 0;
        Queue<String> q = new Queue<>();
        System.out.println("Simulate Waiting Queue in the Bank");
        System.out.println("Customers arrive at difference time");
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] +"("+ arrive[i] +") ");
        }
        System.out.println();
        
        while (true) {
            time++;
            while(n<arrive.length && arrive[n]==time){
                q.enqueue(name[n]);
                n++;
            }
            if (cnt1 == 0) {
                if (!q.isEmpty()) {
                    System.out.println("Time " + time + " Counter 1 serving " + q.dequeue());
                    cnt1 += serviceTime - 1;
                }
            } 
            else {
                cnt1--;
            }

            if (cnt2 == 0) {
                if (!q.isEmpty()) {
                    System.out.println("Time " + time + " Counter 2 serving " + q.dequeue());
                    cnt2 += serviceTime - 1;
                }
            } 
            else {
                cnt2--;
            }

            if (q.isEmpty() && n==arrive.length) {
                break;
            }

            System.out.println("Time " + time + " The queue is ");
            q.showQueue();
            System.out.println();

        }
    }
    
}
