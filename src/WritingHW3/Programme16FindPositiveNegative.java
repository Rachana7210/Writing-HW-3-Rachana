package WritingHW3;

import java.util.Scanner;

public class Programme16FindPositiveNegative {
    //Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
//“ZERO”

    public static void main(String[] args) {
        //Scanner delration for reading input form console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = sc.nextInt();
        findnumberisPositiveNegaticeOrZero(number);
        //closing the scanner object
        sc.close();
    }

    //Finding the Numbe is Positive Negative or Zero
    public static void findnumberisPositiveNegaticeOrZero(int number) {
        if (number > 0){
        System.out.println(number + "is a Positive number");
    }else if(number< 0){
        System.out.println(number + "is a Negative number");
    }else{
            System.out.println(number + "is zero");
        }

    }
}


