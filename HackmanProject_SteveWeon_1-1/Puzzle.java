import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;

public class Puzzle {
   private int correct, index;
   private String guess, word, input, sum, temp, previous;
   private char[] blank, wordFound, wordAlrUsed;
   private boolean have, noInput, symbols, started, alreadyUsed, twoLetter;
    
   public Puzzle() {
       correct = index = 0;
       input = "pneumonia";
       word = input.toUpperCase();
       wordFound = word.toCharArray();
       guess = sum = temp = previous = "";
       blank = new char[word.length()];
       wordAlrUsed = new char[26];
       noInput = have = symbols = started = alreadyUsed = twoLetter = false;
       for (int i = 0; i < word.length(); i++) {
           blank[i] = '_';
       }
   }
   
   public void show() {
       System.out.print("Puzzle: ");
       char x;
       for (int i = 0; i < wordFound.length; i++) {
           x = blank[i];
           System.out.print(x + " ");
       }
       System.out.print("\n" + "Guesses: ");
       if (!started) System.out.print("\n");
       else if (noInput) System.out.print("*NO INPUT\n");
       else if (twoLetter) System.out.print("*TYPE IN ONLY ONE LETTER. YOU TYPED \"" + temp + "\"\n");
       else if (symbols) System.out.print("*USE ONLY ALPHABETS. YOU TYPED \"" + temp + "\"\n");
       else if (alreadyUsed) System.out.print("*ALREADY USED \"" + temp.charAt(0) + "\"\n");
       else {
           sum += " " + previous;
           System.out.print(sum + " " + guess.charAt(0) + "\n");
       }
   }
   
   public boolean isUnsolved() {
       return correct < word.length();
   }
   
   public String getWord() {
       return word;
   }
   
   public boolean makeGuess(String a) {
       started = true;
       have = noInput = symbols = alreadyUsed = twoLetter = false;
       previous = guess;
       temp = a.toUpperCase();
       if (temp.length() <= 0 || temp.charAt(0) == ' ') {
           noInput = true;
           return true;
       }
       if (temp.length() > 1) {
           twoLetter = true;
           return true;
       }
       if (temp.charAt(0) < 'A' || temp.charAt(0) > 'Z') {
           symbols = true;
           return true;
       }
       for (int i = 0; i < 26; i++) { 
           if (String.valueOf(wordAlrUsed[i]).equals(temp.substring(0,1))) {
               alreadyUsed = true;
               return true;
           }
       }
       guess = temp;
       if (guess.charAt(0) >= 'A' && guess.charAt(0) <= 'Z') {
           for (int i = 0; i < word.length(); i++) {               
               if (wordFound[i] == guess.charAt(0)) {
                  blank[i] = word.charAt(i);
                  wordFound[i] = '-';
                  correct++;
                  have = true;
               }
           }
           wordAlrUsed[index] = temp.charAt(0);
           index++;
       }
       if (have) return true;
       return false;
   }
}