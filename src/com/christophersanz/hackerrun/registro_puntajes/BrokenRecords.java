package com.christophersanz.hackerrun.registro_puntajes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.youtube.com/watch?v=zIt1dSMgC-o&list=PLBHL_vhBTMAPhrOtic93Wzt4jgj770kn6&index=4&ab_channel=AZeta
public class BrokenRecords {

    public static List<Integer> breakingRecords(List<Integer> scores){

        int actualMin = 0;
        int actualMax = 0;
        int countMin = 0;
        int countMax = 0;

        List<Integer> brokenRecords = new ArrayList<>();

        for (int i=0; i<scores.size(); i++){
            if(i==0){
                actualMin = scores.get(i);
                actualMax = scores.get(i);
            } else {
                if(scores.get(i) > actualMax){
                    actualMax = scores.get(i);
                    countMax++;
                }
                if(scores.get(i) < actualMin){
                    actualMin = scores.get(i);
                    countMin++;
                }
            }
            System.out.println("score="+scores.get(i)+"|actualMin="+actualMin+"|actualMax="+actualMax+"|countMin="+countMin+"|countMax="+countMax);
        }

        brokenRecords.add(countMin);
        brokenRecords.add(countMax);
        System.out.println("Final(countMin,countMax):"+brokenRecords);

        return brokenRecords;
    }

    public static void main(String[] args) {
        breakingRecords(Arrays.asList(12,24,10,24));
    }

}
