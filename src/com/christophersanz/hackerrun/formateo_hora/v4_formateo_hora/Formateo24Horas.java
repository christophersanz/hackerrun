package com.christophersanz.hackerrun.formateo_hora.v4_formateo_hora;

/*https://youtu.be/OYE1NJatl9I*/
public class Formateo24Horas {

    public static void main(String[] args) {

        String hora = "12:01:00PM";  //19:05:45
        String soloHora = hora.substring(0,8);

        //add 12Hours
        String formato24h = hora;
        if(hora.contains("PM")){
            Integer horaPM = Integer.parseInt(soloHora.substring(0,2));
            horaPM += 12;
            if(horaPM == 24){
                horaPM = 0;
            }
            formato24h = String.format("%02d",horaPM) + soloHora.substring(2,8);
        }
        System.out.println(formato24h);

    }

}
