package com.christophersanz.hackerrun.formateo_hora.v2_formateo_hora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/*https://youtu.be/OYE1NJatl9I*/
public class Formateo24Horas {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2023, 04, 24);
        LocalTime time = LocalTime.of(05, 34, 11);
        LocalDateTime localDateTime = LocalDateTime.of(date, time);

        //add 12Hours
        LocalDateTime localDateTimeAdd12Hours = localDateTime.plusHours(12);

        String formato24h  = DateTimeFormatter.ofPattern("HH:mm:ss a", Locale.ENGLISH).format(localDateTimeAdd12Hours);

        System.out.println(formato24h);

    }

}
