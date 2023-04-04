package com.christophersanz.hackerrun.pares_divisibles.v1_pares_divisibles;

import java.util.Arrays;
import java.util.List;

/*https://youtu.be/MhMvuUcpPug*/
public class DivisibleSumPairs {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3,4,5,6);

        Integer numero = 0;
        Integer parejas = 0;
        do {
            Integer posicion = lista.get(numero);
            for (int i=posicion; i<lista.size(); i++){
                if((posicion + lista.get(i)) % 5 == 0){
                    System.out.println("|"+posicion+","+lista.get(i)+"|");
                    parejas++;
                }
            }
            numero++;
        } while (numero < lista.size());

        System.out.println(parejas);

    }
}
