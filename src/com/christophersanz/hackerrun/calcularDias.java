package com.christophersanz.hackerrun;

import java.util.Arrays;
import java.util.List;

public class calcularDias {

    public static void main(String[] args) {
        List<Long> prestamo = Arrays.asList(3L,15L,16L,45L);
        Integer dias = 1;
        Integer pagoinicial = 0;
        Integer total = 0;

        for (int i=0; i<=30; i++){
            if(i==0){
                pagoinicial = prestamo.get(0).intValue();
                total = prestamo.get(0).intValue();
            }
            if(total<=prestamo.get(1)){
                total = pagoinicial + 2 * total;
                dias++;
            }
        }

        List<Long> d = Arrays.asList(Long.valueOf(dias));

        System.out.println(d);

    }




}
