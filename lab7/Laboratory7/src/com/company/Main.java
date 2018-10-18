package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give text: ");
        String text=in.nextLine();

        Paragraph p=new Paragraph(text);
        System.out.println("Number of sentences is: "+p.getNrOfSentences());
        System.out.println("Number of words is: "+p.getNrOfWords());
        System.out.println("Number of letters is: "+p.getNrOfLetters());
        System.out.println("Number of vowels is: "+p.getNrOfVowels());
        System.out.println("Number of consonants is: "+p.getNrOfConsonants());

    }
}
