package WritingHW3;

import java.util.Scanner;

public class Programme12FindInputValue {
    //  Write a program that tells us input value is number or an alphabet or symbol.
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = sc.next().charAt(0);
        //Object creation
        Programme12FindInputValue inputValue = new Programme12FindInputValue();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);
        //Closing the scanner object
        sc.close();
    }

    // Find the input value is ALPHABET, DIGIT and SYMBOL
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an ALPHABET.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a DIGIT.");
        } else {
            System.out.println(ch + " is a SYMBOL.");
        }
    }

}
