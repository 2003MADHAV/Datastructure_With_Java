package com.kludsa.b15;
public class CRTNumber {
    public static void main(String[] args) {
        int[] modulos = {2,3,5};
        int[] reminders = {0,2,1};
        int k = reminders.length;
        int X = 1,i;
        while(true){
            for(i=0;i<k;i++){
                if(X%modulos[i]!=reminders[i])
                    break;
            }
            if(i==k){
                System.out.println(X);
                break;
            }
            X++;
        }
    }
}