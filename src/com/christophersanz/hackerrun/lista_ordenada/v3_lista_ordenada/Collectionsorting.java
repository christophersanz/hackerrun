package com.christophersanz.hackerrun.lista_ordenada.v3_lista_ordenada;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*https://youtu.be/cNs4IosFJi0*/
public class Collectionsorting
{
    public static void main(String[] args)
    {
        // Create a list of strings
        List<Integer> lista = Arrays.asList(1,9,5,3,7);

        Collections.sort(lista);

        System.out.println("Lista ordenada con Collection.sort() :\n" + lista);
    }
}