package com.christophersanz.hackerrun.radio_lista;

import java.util.Arrays;
import java.util.List;

/*https://youtu.be/oEiXALbHr6I*/
public class Radio {

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,1,0,-1,-1);

        //el radio es la mitad de la medida del diámetro (del Total)
        float positivos = 0;
        float zeros = 0;
        float negativos = 0;
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i)>0){
                positivos++;
            } else if (lista.get(i)<0) {
                negativos++;
            } else {
                zeros++;
            }
        }

        System.out.println("Total de positivos="+positivos+ ", con radio="+String.format("%.6f", positivos/lista.size()));
        System.out.println("Total de positivos="+negativos+ ", con radio="+String.format("%.6f", negativos/lista.size()));
        System.out.println("Total de positivos="+zeros+ ", con radio="+String.format("%.6f", zeros/lista.size()));


    }

}
