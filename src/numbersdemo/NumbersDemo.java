/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersdemo;

import java.util.Scanner;

/**
 *
 * @author Work
 */
public class NumbersDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the the first number: ");
        int number1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the the second number: ");
        int number2 = scanner.nextInt();
        scanner.nextLine();
        
        displayTwiceTheNumber(number1);
        displayTwiceTheNumber(number2);
        displayNumberPlusFive(number1);
        displayNumberPlusFive(number2);
        displayNumberSquared(number1);
        displayNumberSquared(number2);
    }

    private static void displayTwiceTheNumber(int number) {
        int doubleTheNumber = number*2;
        System.out.println("The doubled value of " + number + " is " + doubleTheNumber);
    }

    private static void displayNumberPlusFive(int number) {
        int numberPlusFive = number+5;
        System.out.println("Increasing the number " + number + " by 5 gives " + numberPlusFive);
    }

    private static void displayNumberSquared(int number) {
        int numberSquared = number*number;
        System.out.println("The square of the number " + number + " is " + numberSquared);
    }
    
}
