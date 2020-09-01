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
public class DoubleListNode<T> {
    private T data;
    private DoubleListNode previousLink;
    private DoubleListNode nextLink;

    public DoubleListNode() {
        data = null;
        previousLink = null;
        nextLink = null;
    }

    public DoubleListNode(T a, DoubleListNode b, DoubleListNode c) {
        data = a;
        previousLink = b;
        nextLink = c;
    }

    public void setData(T a) {
        data = a;
    }

    public void setPreviousLink(DoubleListNode b) {
        previousLink = b;
    }

    public void setNextLink(DoubleListNode c) {
        nextLink = c;
    }
    
    public void setLink(DoubleListNode a, DoubleListNode b){
        previousLink = a;
        nextLink = b;
    }

    public T getData() {
        return data;
    }

    public DoubleListNode getPreviousLink() {
        return previousLink;
    }

    public DoubleListNode getNextLink() {
        return nextLink;
    }
    
    public String toString(){
        return " <-- "+ data +" --> ";
    }  
}
