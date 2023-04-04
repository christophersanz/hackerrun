package com.christophersanz.hackerrun.lista_ordenada.v4_lista_ordenada;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*https://youtu.be/cNs4IosFJi0*/
public class Collectionsorting
{
    public static void main(String[] args)
    {
        //crear una lista de cadenas
        List<Integer> lista = Arrays.asList(1,9,5,3,7);
        Collections.sort(lista);
        System.out.println("Lista ordenada con Collection.sort() :\n" + lista);

        //suma solo 4 menores
        long sumaMenores = 0;
        for(int i=0; i<4; i++){
            sumaMenores += lista.get(i);
        }
        System.out.println("sumaMenores= "+sumaMenores);

        //suma solo 4 mayores
        long sumaMayores = 0;
        for(int i=4; i>0; i--){
            sumaMayores += lista.get(i);
        }
        System.out.println("sumaMayores= "+sumaMayores);


    }
}