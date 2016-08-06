package com.mycompany.sametdiritasks;

import java.lang.Math;
import java.util.ArrayList;

/**
 * @author SDIRI
 *
 * This class recurs over an array, halves the number and floor()
 *
 */
public class Recursive {

    //private class elements
    private ArrayList<Integer> arr = new ArrayList<Integer>();
    private int numberx;

    //recurs and writes the result at the end.
    public int RecursiveFunc(int number, boolean state) {
        //if number<=2, no need to continue. Print the result
        if (number <= 2) {
            for (int i = arr.size() - 1; i >= 0; i--) {
                System.out.println(arr.get(i));
            }
            return 0;
        } else {
            if (state) {
                //state is necessary for the first state
                arr.add(number);
            }
            numberx = (int) (Math.floor(number / 2));
            //add the new number in the list 'arr'
            arr.add(numberx);
            return RecursiveFunc(numberx, false);
        }
    }
}
