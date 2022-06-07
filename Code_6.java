//Write java program to get a number from the user and print whether it is positive or negative

import java.util.Scanner;
public class Code_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        if (num >=0) {
            System.out.println("A number is positive");
        } else {
            System.out.println("A number is negative");

        }
    }
}
