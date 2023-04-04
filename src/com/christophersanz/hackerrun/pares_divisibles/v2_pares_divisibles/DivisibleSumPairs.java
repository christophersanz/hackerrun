package com.christophersanz.hackerrun.pares_divisibles.v2_pares_divisibles;

import java.util.Arrays;
import java.util.List;

/*https://youtu.be/MhMvuUcpPug*/
public class DivisibleSumPairs {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3,4,5,6);

        Integer parejas = 0;

        for (int i=0; i<lista.size(); i++){
            for (int j=0; j<lista.size(); j++){
                if(i<j&&(lista.get(i) + lista.get(j)) % 5 == 0){
                    System.out.println("|"+lista.get(i)+","+lista.get(j)+"|");
                    parejas++;
                }
            }
        }


        System.out.println(parejas);

    }
}
