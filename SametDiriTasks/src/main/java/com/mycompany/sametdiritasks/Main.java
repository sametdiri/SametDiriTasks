/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.sametdiritasks;

/**
 *
 * @author SDIRI
 */
public class Main {
    public static void main(String []args) {
        //Soru - 1
        SortBunchOfWord sbw = new SortBunchOfWord();
        String[] values = {"aaaasd", "a", "aab", "aaabcd", "ef", "cssssssd", "fdz", "kf", "zc", "lklklklklklklklkl", "l"};
        sbw.SortWords(values);

        //Soru - 2
        Recursive rec = new Recursive();
        rec.RecursiveFunc(9, true);
        
        //Soru - 3
        
        LoopExample le = new LoopExample();
        le.IterateLoop();
        
        //Soru - 4
        SwapValues sv = new SwapValues();
        sv.SwapVal(15, 35);
        
        //Soru - 6
        FindMostRepated fmr = new FindMostRepated();
 
        String[] inputArray = {"apple","pie","pie","apple","red","red","red","apple"};
        fmr.GetMostRepeated(inputArray);
        
    }
}
