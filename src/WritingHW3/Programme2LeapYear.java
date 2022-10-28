package WritingHW3;

import java.util.Scanner;

public class Programme2LeapYear {
    // Write a java program to input any year like (ex.2007) and find out if it is leap year or
    //not?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Year:");
        int year = sc.nextInt();
        Programme2LeapYear leapYear = new Programme2LeapYear();
        leapYear.isItLeapYear(year);
        //closing the scanner object
        sc.close();
    }
    // checking is it leap year or not
    public void isItLeapYear(int year){
        if (year % 4==0 && year % 100!=0 || year % 400==0){
            System.out.println("The year" + year + "is leap year");
            return;
        }
        System.out.println("The year" + year + "is not leap year");
    }

}
