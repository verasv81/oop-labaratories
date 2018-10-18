package com.company;

public class Sentence {
    String sentance;

    int getNrOfWords(){

        String[] words = sentance.split("\\s");
        return words.length;
    }
}
