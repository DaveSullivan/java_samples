/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.WORLD;

/**
 *
 * @author Dave
 */
public class Qsort {

    static void sort(int[] array, int start, int end) // start is first elem, end is last
    {
        if (end <= start)
            return; // down to one or zero elements
        int partitionElem = array[end];
        int left = start;
        int right = end - 1;
        while (left < right){
            if (array[left] < partitionElem)
            {
                left++;
            }
            else
            {
                int temp = array[right];
                array[right] = array[left];
                array[left] = temp;
                right--;
            }
        }
        if (array[left] < partitionElem)
            left++;
        if (left < end)
        {
            int temp = array[end];
            array[end] = array[left];
            array[left] = temp;
        }
        else
        {
            int i = 9;
        }
        
        sort(array, start, left - 1);
        sort(array, left + 1, end);
    }
    
    public static void main(String... args) {
        {
            int[] test = {4,3,5,6,1};
            sort(test, 0, test.length - 1);
            for (int i : test)
                System.out.print(i + ", ");
            System.out.print("\n");
        }
         {
            int[] test = {1,2,3,4,5};
            sort(test, 0, test.length - 1);
            for (int i : test)
                System.out.print(i + ", ");
            System.out.print("\n");
        }
         {
            int[] test = {1,1,1,1,1};
            sort(test, 0, test.length - 1);
            for (int i : test)
                System.out.print(i + ", ");
            System.out.print("\n");
        }
         {
            int[] test = {5,4,3,2,1};
            sort(test, 0, test.length - 1);
            for (int i : test)
                System.out.print(i + ", ");
            System.out.print("\n");
        }
    }
}
