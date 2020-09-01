/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author muham
 */
//NOT DONE YET
public class CircularLinkedList<T> {

    private ListNode head;

    public CircularLinkedList() {
        head = null;
    }

    public void addNode(T a) {
        ListNode newNode = new ListNode(a, null);
        ListNode currentNode = head;
        if(head==null){
            head=newNode;
            newNode.setLink(head);
        }
        else{
            while(currentNode.getLink()!=head){
                currentNode=currentNode.getLink();
            }
            currentNode.setLink(newNode);
            newNode.setLink(head);
        }
    }
    
    public void addFrontNode(T a){
        ListNode newNode = new ListNode(a, null);
        ListNode currentNode = head;
        if(head==null){
            head=newNode;
            newNode.setLink(head);
        }
        else{
            while(currentNode.getLink()!=head){
                currentNode=currentNode.getLink();
            }
            newNode.setLink(head);
            head=newNode;
            currentNode.setLink(head);
        }
    }
    public void addNodeByPosition(T a, int index){
        
    }
}
