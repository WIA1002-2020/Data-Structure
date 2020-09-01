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
//DEFINE A GENERIC CLASS CONTAINING ELEMENTS OF TYPE T,
//WHERE T IS A PLACEHOLDER FOR THE NAME OF A TYPE
public class Test1<T> {

    private T t;

    public Test1(T t) {
        this.t = t;
    }

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public String toString() {
        return t + " ";
    }
}
