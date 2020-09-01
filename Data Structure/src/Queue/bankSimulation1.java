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
public class bankSimulation1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] name = {"Ahmad", "Syakir", "Chong", "Kumar", "Ali"};
        int cnt1 = 0, cnt2 = 0, serviceTime = 3;
        Queue<String> q = new Queue<>();
        System.out.println("Simulate Waiting Queue in the Bank");
        System.out.println("Time 0: All customers queue at the same time");
        int time = 0;
        for (int i = 0; i < name.length; i++) {
            q.enqueue(name[i]);
        }
        System.out.println("The queue is ");
        q.showQueue();
        System.out.println("");

        while (true) {
            time++;
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

            if (q.isEmpty()) {
                break;
            }

            System.out.println("Time " + time + " The queue is ");
            q.showQueue();
            System.out.println();

        }
    }

}
