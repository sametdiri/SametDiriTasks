package com.mycompany.sametdiritasks;

/**
 *
 * @author SDIRI
 *
 * This class sorts bunch of word by most repeated 'a' and length.
 */
public class SortBunchOfWord {

    public void SortWords(String[] values) {

        int i = 0;
        int[][] arr = new int[values.length][3];
        int[] tmp = new int[3];   //temporary array 

        for (String x : values) {
            arr[i][0] = i;
            arr[i][1] = 0;
            arr[i][2] = 0;
            for (char y : x.toCharArray()) {
                arr[i][1] = (y == 'a') ? arr[i][1] + 1 : arr[i][1];
            }
            arr[i][2] = x.length();   //necessary for sorting non 'A' elements
            i++;
        }
        //Buble Sorting according to number of 'a' 
        for (i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i][1] < arr[j][1]) {
                    //swapping index
                    tmp[0] = arr[i][0];
                    arr[i][0] = arr[j][0];
                    arr[j][0] = tmp[0];
                    //swapping number of 'a'
                    tmp[1] = arr[i][1];
                    arr[i][1] = arr[j][1];
                    arr[j][1] = tmp[1];
                    //swapping number of chars
                    tmp[2] = arr[i][2];
                    arr[i][2] = arr[j][2];
                    arr[j][2] = tmp[2];
                }
            }
        }
        //Buble Sorting according to non 'a' elements 
        for (i = 0; i < arr.length; i++) {
            if (arr[i][1] == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i][2] < arr[j][2]) {
                        //swapping index
                        tmp[0] = arr[i][0];
                        arr[i][0] = arr[j][0];
                        arr[j][0] = tmp[0];
                        //swapping number of 'a'
                        tmp[1] = arr[i][1];
                        arr[i][1] = arr[j][1];
                        arr[j][1] = tmp[1];
                        //swapping number of chars
                        tmp[2] = arr[i][2];
                        arr[i][2] = arr[j][2];
                        arr[j][2] = tmp[2];
                    }
                }
            }
        }
        //print values
        for (i = 0; i < arr.length; i++) {
            System.out.print(values[arr[i][0]] + " - ");
        }
        System.out.println();
    }
}
