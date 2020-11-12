/*
 * Josh Bartlett
 * Purpose: To determine if integer is a palindrome or not
 * April 27, 2019
 * Bellevue University
 * palindrome.java
 */

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // ask user for input, declare inputNum variable, 
        // add input to variable inputNum
        System.out.print("Enter a three-digit integer: ");
        int inputNum = input.nextInt();
        
        // declares variable ones, adds ones digit to variable ones
        int ones = inputNum % 10;
        
        // declares variable hundreds, adds hundreds digit to variable hundreds
        int hundreds = (inputNum / 100) % 10;
        
        // if statment comparing ones to hundreds and display correct output
        if(ones == hundreds){
            System.out.println(inputNum + " is a palindrome");
        }
        else{
            System.out.println(inputNum + " is not a palindrome");
        }
    }
}
