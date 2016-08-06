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
public class SwapValues {
    
    public void SwapVal(int a, int b) {
        System.out.println("İlk durumda");
        System.out.println("a=" + a + ", b=" + b);
        a = a + b; //a is 15 and b is 35
        b = a - b; //a is 50 but b is 15 
        a = a - b; //a is 35 and b is 15. swapping completed
        System.out.println("Son durumda");
        System.out.println("a=" + a + ", b=" + b);
    }
}
