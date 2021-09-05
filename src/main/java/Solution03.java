/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Gabriel Telleria
 */

import java.util.Scanner;

/*
Prompt the user for a quote
    save input into userQuote
Prompt user for who said the quote
    save input into userAuthor
Print "<userAuthor> says, "<userQuote>"
*/
public class Solution03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("What is the quote? ");
        String userQuote = input.nextLine();
        System.out.printf("Who said it? ");
        String userAuthor = input.nextLine();
        System.out.println(userAuthor + " says, \"" + userQuote + "\"");
    }
}
