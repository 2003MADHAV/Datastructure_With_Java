package com.kludsa.b15;
public class CRTNumbers {
    public static void main(String[] args) {
        int[] modulos = {2,3,5};
        int[] reminders = {0,2,1};
        int k = reminders.length;
        int i, xMax=0;
        for(int X=100;X<=999;X++){
            for(i=0;i<k;i++){
                if(X%modulos[i]!=reminders[i])
                    break;
            }
            if(i==k){
                xMax=X;
            }
        }
        System.out.println(xMax);
    }
}