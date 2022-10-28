package WritingHW3;

import java.util.Scanner;

public class Programme1OddEvenTernaryOperator {
    // Write a java program that tells us that Input number is odd or even?
    //HINT: use ternary operator (? :)

    public static void main (String[] args){
        //scanner declaration for reading input for console
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = sc.nextInt();
        isItOddOrEvenNumber(number);
        //closing the scanner object
        sc.close();
    }
    //checking the number is even or odd
    public static void isItOddOrEvenNumber(int number){
        //ternary operator is used
        String evenOrOdd = (number % 2==0)?"Even" : "Odd";
        System.out.println("The" + number + "is" + evenOrOdd + "number");
    }
}
