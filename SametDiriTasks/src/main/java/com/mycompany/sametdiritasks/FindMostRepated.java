package com.mycompany.sametdiritasks;

import java.util.ArrayList;

/**
 * @author SDIRI
 * 
 * This class finds the most repeated value in a list.
 * 
 */
public class FindMostRepated {
    public static void GetMostRepeated(String[] inputData){
        int count = 0, countx = 0, result = 0, repeatCount = 0, index = 0;
        ArrayList<Integer> multi = new ArrayList<>();
        boolean addVal = true;
        //Loop-1: Get the test element
        for (int i = 0; i < inputData.length; i++) {
            count = 0;
            //Loop-2: Checks the rank
            for (int j = 0; j < inputData.length; j++) {
                //Compare datas making uppercase for typographical mistake (upper/lower cases)
                result = inputData[i].trim().toUpperCase().compareTo( inputData[j].trim().toUpperCase() );
                count = (result == 0) ? count + 1 : count;
            }
            
            //if count bigger than repeat count
            if (count > repeatCount) {
                repeatCount = count;
                //to print, assing i to index varible.
                index = i;
                multi.clear();
            } else if (count == repeatCount){
              //if count and repeatCount equals then there may be same times repeated values.
                addVal = true;
                for (int t = 0; t < multi.size(); t++) {
                    countx = 0;
                    for (int z = 0; z < multi.size(); z++) {
                        //if the new value is not in list
                        if (inputData[multi.get(t)] == inputData[multi.get(z)]) {
                            countx++;
                            if (countx > 1){
                               addVal = false; 
                            }
                        }
                    }
                }
                if (addVal){
                    multi.add(i);
                }
            }
        }
        //because of upperCase, it adds same value twice if last value is most repeated value.
        for (int t = 0; t < multi.size(); t++) {
            count = 0;
            for (int z = 0; z < multi.size(); z++) {
                //if the new value is not in list
                if (inputData[multi.get(t)] == inputData[multi.get(z)]) {
                    count++;
                    if (count > 1){
                        multi.remove(t);    
                    }
                }
            }
        }

        System.out.println("----------------------");
        System.out.println("Question - 6");
        if (multi.isEmpty()) {
            System.out.println("Most repeated: \"" + inputData[index] + "\"");
            System.out.println("Repeat Num: " + repeatCount);
        } else {
            int k = 1;
            for (int x : multi) {
                System.out.println("Most repeated - " + k++ + ": \"" + inputData[x] + "\"");
                System.out.println("Repeat Num: " + repeatCount);
            }
        }
        
    }
}
