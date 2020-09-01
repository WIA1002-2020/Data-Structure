/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.Random;
/**
 *
 * @author muham
 */
//NOT DONE YET
public class averageWaitingTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        Request request;
        int NRequest = 10, numberOfQueue = 2;
        Queue<Request>[] SQ = new Queue[numberOfQueue];
        Queue<Request> RQ = new Queue<>();

        for (int i = 0; i < numberOfQueue; i++) {
            SQ[i] = new Queue<>();
        }

        int currentTime = 0;
        int minIAT = 0, maxIAT = 10, minST = 5, maxST = 15;

        int IAT, ST;
        for (int i = 0; i < NRequest; i++) {
            IAT = minIAT + r.nextInt(maxIAT - minIAT - 1);
            ST = minST + r.nextInt(maxST - minST - 1);
            currentTime += IAT;
            request = new Request(currentTime, ST);
            RQ.enqueue(request);
        }

        int[] indexandFT = new int[2];
        int index;
        int WT = 0, NProcess = 0;
        currentTime = 0;

        while (true) {
            //dequeue all SQ if FT = currentTime
            for (int i = 0; i < numberOfQueue; i++) {
                if (!SQ[i].isEmpty()) {
                    if (SQ[i].peek().getFT() == currentTime) {
                        SQ[i].dequeue();
                    }
                }
            }
            //process queue if AT=currentTime
            while(!RQ.isEmpty()&&RQ.peek().getAT==currentTime){
                request=RQ.dequeue();
                //get the best queue and finish time
                getBestQueue(request.getAT(),request.getST(),SQ,indexandFT);
                request.setFT(indexandFT[1]);
                WT+=request.getWT();
                index=indexandFT[0];
                System.out.println("Request "+ (NProcess+1) +" : AT = "+ request.getAT() +
                        " ST = "+ request.getST() +" FT = "+ request.getFT() +
                        " WT = "+ request.getWT() + " Queus = "+ index);
                SQ[index].enqueue(request);
                NProcess++;
            }
            currentTime++;
            if(NProcess==NRequest)
                break;
        }
        System.out.println("The waiting time is : "+WT);
        System.out.println("The average waiting time is : "+ WT/(NRequest*1.0));
    }

    public static void getBestQueue(int at, int st, Queue<Request>[] SQ, int[] indexandFT) {
        Queue<Request> hold = new Queue<>();
        int temp, FT=0, index=0;
        if(SQ[index].isEmpty())
            FT=at+st;
        else{
            while(SQ[index].getSize()!=1)
                hold.enqueue(SQ[index].dequeue());
            if(at<SQ[index].peek().getFT())
                FT=SQ[index].peek().getFT()+st;
            else
                FT=at+st;
            hold.enqueue(SQ[index].dequeue());
            while(!hold.isEmpty())
                SQ[index].enqueue(hold.dequeue());
        }
        for (int i = 0; i < SQ.length; i++) {
            if(SQ[i].isEmpty()){
                temp=at+st;
                if(temp<FT){
                    index=i;
                    FT=temp;
                }
            }
            else{
                while(SQ[i].getSize()!=1)
                    hold.enqueue(SQ[i].dequeue());
                if(at<SQ[i].peek().getFT())
                    temp=SQ[i].peek().getFT()+st;
                else
                    temp=at+st;
                if(temp<FT){
                    index=i;
                    FT=temp;
                }
                hold.enqueue(SQ[i].dequeue());
                while(!hold.isEmpty())
                    SQ[i].enqueue(hold.dequeue());
            }
        }
        indexandFT[0]=index;
        indexandFT[1]=FT;
    }

}
