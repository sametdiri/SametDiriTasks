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
public class LoopExample {
    public void IterateLoop() {
        System.out.println("-------");
        /*for (int i = 0; i <= 2; i++) {
            System.out.println(i);
        }
        System.out.println("İlk döngüde i++ operatörüyle önce i değeriyle işlem yapılır ardından i değişkeni 1 arttırılır."
                + "\n"
                + "İkinci döngüde ise önce i değişkeni 1 arttırılır sonra i ile işlem yapılır.");
        System.out.println("-------");
        */
        int j = 0;
        for (int i = 0; i<=2; ++i){
            System.out.println(++j);
        }
        for (int i = 0; i <= 2; ++i) {
            System.out.println(i);
        }
System.out.println("-------");
    }
}
