package com.christophersanz.hackerrun.lista_ordenada.v5_lista_ordenada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*https://youtu.be/cNs4IosFJi0*/
public class Collectionsorting
{
    public static void main(String[] args)
    {
        //crear una lista de cadenas
        List<Integer> lista = List.of(1, 9, 5, 3, 7);
        //creando una nueva lista basandose en la anterior
        List<Integer> listaOrdenada = new ArrayList<>(lista);

        //suma solo 4 menores
        listaOrdenada.sort(Integer::compareTo); //ordenacion natural
        System.out.println("Lista con ordenacion natural con Collection.sort() :\n" + listaOrdenada);
        long sumaMenores = 0;
        for(int i=0; i<4; i++){
            sumaMenores += listaOrdenada.get(i);
        }
        System.out.println("sumaMenores= "+sumaMenores);

        //suma solo 4 mayores
        listaOrdenada.sort(Collections.reverseOrder()); //ordenacion inversa
        System.out.println("Lista con ordenacion inversa con Collection.reverseOrder() :\n" + listaOrdenada);
        long sumaMayores = 0;
        for(int i=0; i<4; i++){
            sumaMayores += listaOrdenada.get(i);
        }
        System.out.println("sumaMayores= "+sumaMayores);

    }
}