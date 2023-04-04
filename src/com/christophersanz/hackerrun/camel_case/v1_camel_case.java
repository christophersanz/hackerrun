package com.christophersanz.hackerrun.camel_case;


public class v1_camel_case {

    public static String converter(String text){
        String[] words = text.split("[\\W_]+");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i == 0) {
                word = word.isEmpty() ? word : word.toLowerCase();
            } else {
                word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            }
            builder.append(word);
        }
        System.out.println(builder.toString());

        return builder.toString();
    }

    public static void main(String[] args) {
        converter("christopher sanchez");
        converter("THIS STRING SHOULD BE IN CAMEL CASE");
    }

}
