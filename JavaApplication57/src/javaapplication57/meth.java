/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication57;

/**
 *
 * @author phunon
 */
public class meth {
    public int[] numList=new int[5];
   public  int count=0;
   
    public void add(int num){
        if(count<numList.length){
            numList[count]= num;
            count++;
        }
        else{
            System.out.println("Full!");
        }
        
    }
    public int findMax(){
        int temp=0;
        for(int i=0;i<numList.length;i++){
            
            if(temp<numList[i]){
                temp=numList[i];
            }
        }
        for(int i=0;i<numList.length;i++){
            if(numList[i]==temp){
                numList[i]=0;
                
            }
        }
        return temp;
    }
    
    public void sort(){
        int temp;
      for(int k=0;k<numList.length-1;k++){// สลับตามจำนวนระหว่างคู่ครั้ง เพื่อให้สลับครบทุกคู่
      for(int i=0;i<numList.length-1;i++){ //สลับที่ 2ตำแหน่ง
          if(numList[i]<numList[i+1]){
             temp=numList[i];
             numList[i]=numList[i+1];
             numList[i+1]=temp;
          }
          }
      }
    }
    
    public String showArr(){
        String temp="";
        for(int i=0;i<numList.length;i++){
            temp+= numList[i]+" ";
        }
        return temp;
    }
}
