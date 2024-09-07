
/**
 * Write a program that reads in a line of text and then outputs that line of text with 
 * the first occurrence of "hate" changed to "love". For example, a possible sample 
 * dialogue might be the following:
 * Enter a line of text.
 * I hate you.
 * I have rephrased that line to read:
 * I love you.
 * If the word "hate" does not appear in the sentence, simply return the original String.
 * If the word "hate"occurs more than once in the line, 
 * your program should replace only the first occurrence of "hate".
 * 
 * @author Terence Wu
 * @version 9/7/2024
 */

import java.util.Scanner;

public class LoveMain {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Love l = new Love();
        
        System.out.println("Enter a line of text: ");
        string str = s.nextLine();
        System.out.println("I have rephrased that to read: "+s.loveNotHate(str);
    }

}
