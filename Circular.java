/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.WORLD;

import java.util.ArrayList;
import java.util.Iterator;

class CircularArrayIterator<E> implements Iterator {
    CircularArray<E> cArray = null;
    int cur = 0;
    
    public CircularArrayIterator(CircularArray<E> cArray)
    {
        this.cArray = cArray;
    }

    @Override
    public boolean hasNext() {
        return cur < cArray.size();
    }

    @Override
    public E next() {
        return cArray.get(cur++);
    }    
};

class CircularArray<E> implements Iterable<E> {
    E[] array = null;
    int head = 0;
    
    @Override
    public Iterator<E> iterator()
    {
        return new CircularArrayIterator<E>(this);
    }
    
    public CircularArray(int size)
    {
        array = (E[]) new Object[size];
    }
    
    int convert(int rawIndex){
        return (rawIndex + head) % array.length;
    }
    
    public void set(int i, E val)
    {
        array[convert(i)] = val;
    }
    public E get(int i){
        return array[convert(i)];
    }
    
    public void rotate(int shiftRight){
        head = convert(shiftRight);
    }
    
    int size()
    {
        return array.length;
    }
};

/**
 *
 * @author Dave
 */
public class Circular {
    public static void main(String... args) {
    
        //ArrayList<String> stringListCore = new ArrayList<>(10);
        //stringListCore.size();
        
        CircularArray<String> cArray = new CircularArray<>(3);
        cArray.rotate(1);
        cArray.set(0, "First");
        cArray.set(1, "second");
        cArray.set(2, "Third");
        for (String st: cArray){
            System.out.println(st);
        }
    }
}
