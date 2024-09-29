package com.chmnu_ki_123.c3;

public class Unicode {
    public static void main(String[] args) {

        char spadeSuit = '\u2660';      // Піка (масть)
        char infinity = '\u221E';       // Знак нескінченності
        char greekAlpha = '\u03B1';     // Грецька літера альфа
        char copyright = '\u00A9';      // Знак копірайту
        char peaceSymbol = '\u262E';    // Символ миру

        System.out.println("Stored Unicode Characters using Escape Sequences:");
        System.out.println("Spade Suit: " + spadeSuit);
        System.out.println("Infinity Symbol: " + infinity);
        System.out.println("Greek Letter Alpha: " + greekAlpha);
        System.out.println("Copyright Symbol: " + copyright);
        System.out.println("Peace Symbol: " + peaceSymbol);
    }
}