/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication57;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author phunon
 */
public class JavaApplication57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      meth m1=new meth();
      m1.add(13);
      m1.add(23);
      m1.add(32);
      m1.add(45);
      m1.add(54);
      System.out.println(m1.showArr());

      m1.sort();
        System.out.println(m1.showArr());

    }

 
}
