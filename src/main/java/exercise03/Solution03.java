/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mohit Ballikar
 */
package exercise03;
import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner quotescan = new Scanner(System.in);
        Scanner authorscan = new Scanner(System.in);

        System.out.print("What is the quote? ");
        String quote = quotescan.nextLine();

        System.out.print("Who said it? ");
        String author = authorscan.nextLine();

        System.out.print(author + " says, " + '\u0022' + quote + '\u0022');
    }
}
/*
    Import the scanner method to allow for user input storage
    Define two scanners for both user inputs (author and quote)
    Prompt the user for the quote and then the author
    Print out the author stating the quote with necessary formatting for quotes
 */