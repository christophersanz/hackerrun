package com.christophersanz;

import java.util.*;

public class HackerRun {

    public static void sumatoriaMaxMin(List<Integer> lista){
        long sumatoriaChicos = 0;
        long sumatoriaGrandes= 0;

        List<Integer> listaOrdenada = new ArrayList<>(lista);
        listaOrdenada.sort(Integer::compareTo);
        System.out.println("Lista Ordenada="+listaOrdenada);
        for(int i=0; i<listaOrdenada.size()-1; i++){
            sumatoriaChicos += listaOrdenada.get(i);
        }
        System.out.println("Total sumatoriaChicos = " +sumatoriaChicos);

        Collections.sort(lista);
        for(int i=lista.size()-1; i>0; i--){
            System.out.println("Lista Descendente="+listaOrdenada.get(i));
        }

        listaOrdenada.sort(Collections.reverseOrder());
        for(int i=0; i<listaOrdenada.size()-1; i++){
            sumatoriaGrandes += listaOrdenada.get(i);
        }
        System.out.println("Total sumatoriaGrandes = " +sumatoriaGrandes);
    }

    public static void main(String[] args) {
        sumatoriaMaxMin(List.of(1, 9, 5, 3, 7));
    }

}
