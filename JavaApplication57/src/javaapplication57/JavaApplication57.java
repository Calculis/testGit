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
    Scanner scan=new Scanner(System.in);
    int cas;
    boolean a=true;
    while(a){
        System.out.println("press 1,2");
        cas=scan.nextInt();
        switch(cas){
            case 1:
                System.out.println("Input num");
                m1.add(scan.nextInt());
                break;
            case 2:
                m1.sort();
                a=false;
                break;
            default:
                
        }
    }
        System.out.println(m1.showArr());
        

    }

 
}
