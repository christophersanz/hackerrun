package com.christophersanz.hackerrun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(5,5,3,5,2,5);

        int repetido = 0;
        List<Integer> listaNumeros = new ArrayList<>();
        for(int i=0; i<lista.size(); i++){
            if(listaNumeros.contains(lista.get(i))){
                repetido++;
            }
            listaNumeros.add(lista.get(i));
        }
       System.out.println(lista.size()-repetido);
    }

}
