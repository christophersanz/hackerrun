package com.christophersanz.hackerrun.formateo_hora.v3_formateo_hora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/*https://youtu.be/OYE1NJatl9I*/
public class Formateo24Horas {

    public static void main(String[] args) {

        String hora = "12:01:00PM";  //19:05:45
        String soloHora = hora.substring(0,8);
        String[] t = soloHora.split(":");

        LocalDate date = LocalDate.of(2023, 04, 24);
        LocalTime time = LocalTime.of(Integer.parseInt(t[0]), Integer.parseInt(t[1]), Integer.parseInt(t[2]));
        LocalDateTime localDateTime = LocalDateTime.of(date, time);

        //add 12Hours
        LocalDateTime localDateTimeAdd12Hours = localDateTime;
        if(hora.contains("PM")){
            localDateTimeAdd12Hours = localDateTime.plusHours(12);
        }
        String formato24h = DateTimeFormatter.ofPattern("HH:mm:ss", Locale.ENGLISH).format(localDateTimeAdd12Hours);

        System.out.println(formato24h);

    }

}
