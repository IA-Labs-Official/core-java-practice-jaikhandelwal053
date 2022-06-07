//Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

import java.util.Scanner;
public class Code_4 {
    public static void main(String[] args) {
        int n,result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number between 0 and 1000 : ");
        int digit = input.nextInt();
        n = digit;
        while (n !=0) {
            int r = n%10;
            result = result + r;
            n = n/10;  
        }
        System.out.println("Result "+result);
    }
}
