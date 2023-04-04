package com.christophersanz.hackerrun.lista_ordenada.v2_lista_ordenada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*https://youtu.be/cNs4IosFJi0*/
public class Collectionsorting
{
    public static void main(String[] args)
    {
        // Create a list of strings
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(9);
        lista.add(5);
        lista.add(3);
        lista.add(7);

        Collections.sort(lista);

        System.out.println("Lista ordenada con Collection.sort() :\n" + lista);
    }
}