package com.christophersanz.hackerrun.lista_ordenada.v1_lista_ordenada;

import java.util.ArrayList;
import java.util.Collections;

/*https://youtu.be/cNs4IosFJi0*/
public class Collectionsorting
{
    public static void main(String[] args)
    {
        // Create a list of strings
        ArrayList<String> al = new ArrayList<String>();
        al.add("Geeks For Geeks");
        al.add("Friends");
        al.add("Dear");
        al.add("Is");
        al.add("Superb");

        Collections.sort(al);

        System.out.println("Lista ordenada con Collection.sort() :\n" + al);
    }
}