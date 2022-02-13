package com.alfabank.work53;

public class Task53 {
    public static void main(String[] args) {
        String text = "An information system is designed to collect, " +
                "process, store and distribute information";
        String firstWord = text.substring( 0, text.indexOf(" ") );
        String lastWord = text.substring( text.lastIndexOf(" ") + 1, text.length() );
        String middleOfText = text.substring( text.indexOf(" "), text.lastIndexOf(" ") + 1 ) ;
        System.out.println(lastWord + middleOfText + firstWord);
    }
}
