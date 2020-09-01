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
public class Test2<T, U> {
    private T t;
    private U[] u;

    public Test2(T t, U[] u) {
        this.t = t;
        this.u = u;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void setU(U[] u) {
        this.u = u;
    }

    public T getT() {
        return t;
    }

    public U[] getU() {
        return u;
    }
    
    public String toString(){
        String a = "";
        a = "T is "+ a +"\n";
        for(U value : u){
            a+=value +" ";
        }
        return a;
    }
}
