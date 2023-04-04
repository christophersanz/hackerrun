package com.christophersanz.hackerrun.formateo_hora.v1_formateo_hora;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/*https://youtu.be/OYE1NJatl9I*/
public class Formateo24Horas {

    public static void main(String[] args) throws ParseException {

        String formato24h = DateTimeFormatter.ofPattern("HH:mm:ss a", Locale.ENGLISH).format(LocalDateTime.now());

        System.out.println(formato24h);

    }

}
