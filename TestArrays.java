/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.WORLD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


/**
 *
 * @author Dave
 */
public class TestArrays {
     public static void main(String... args) {
         {
            ArrayList<Integer> ints = new ArrayList<>();
            ints.add(5);
            ints.add(3);
            ints.add(7);
            ints.add(8);
            ints.add(7);

            ints.sort( (a,b) -> a < b ? -1 : 1);
            System.out.println(ints);
         }
         {
            ArrayList<Integer> ints = new ArrayList<>();
            ints.add(5);
            ints.add(3);
            ints.add(7);
            ints.add(8);
            ints.add(7);

            Integer i = 3;
            i.intValue();
            
            ints.sort((a,b) -> (a%2 == b%2) ? (a < b ? -1 : 1) : a%2 == 0 ? -1 : 1);
            
            ints.forEach(e -> System.out.print(e + ", "));
            System.out.println(ints);
         }
     }   
}
