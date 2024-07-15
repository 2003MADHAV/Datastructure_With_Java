package com.kludsa.b12;
public class CRTNumber {
    public static void main(String[] args) {
        int[] modulos = {2,3,5};
        int[] reminders = {1,2,2};
        int k = modulos.length;
        int i;
        for(int X=10;X<=99;X++){
            for(i=0;i<k;i++){
                if(X%modulos[i]!=reminders[i])
                    break;
            }
            if(i==k){
                System.out.print(X+" ");
                break;
            }
        }
    }
}