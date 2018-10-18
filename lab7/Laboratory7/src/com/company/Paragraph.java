package com.company;

public class Paragraph {
    String paragraph;

    Paragraph (){}

    Paragraph(String paragraph){
        this.paragraph=paragraph;
    }
    //get no of Sentence
    int getNrOfSentences(){
        String[] sentences = paragraph.split("\\.");
        return sentences.length;
    }

    //get number of Words
    int getNrOfWords(){
        int wordCount = 0;

        boolean word = false;
        int endOfLine = paragraph.length() - 1;

        for (int i = 0; i < paragraph.length(); i++) {
            if (Character.isLetter(paragraph.charAt(i)) && i != endOfLine) {
                word = true;
            } else if (!Character.isLetter(paragraph.charAt(i)) && word) {
                wordCount++;
                word = false;
            } else if (Character.isLetter(paragraph.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }

    //get number of vowels
    int getNrOfVowels() {
        int vowelCount = 0;
        String p=paragraph.toUpperCase();
        char[] words=p.toCharArray();
        for (int i = 0; i < words.length; i++) {
            char z = words[i];
            if (z == 'A' || z == 'E' || z == 'I' || z == 'O' || z == 'U') {
                vowelCount++; }
            }
        return vowelCount;
    }

    //get number of consonants
    int getNrOfConsonants(){
        int consonantsCount = 0;
        String p=paragraph.toLowerCase();
        char[] words=p.toCharArray();
        for (int i = 0; i < words.length; i++) {
            char z = words[i];
            if (z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u' ) {

            }
            else if(z!=' ') consonantsCount++;
        }
        return consonantsCount;
    }

    int getNrOfLetters(){
        return getNrOfConsonants()+getNrOfVowels();
    }

    void getTopUsed(){

    }
}
