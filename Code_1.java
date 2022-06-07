//Write a Java program that accepts four integer from the user and prints equal if all four are equal and not equal otherwise.
import java.util.Scanner;

public class Code_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Four number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        if (num1 == num2 && num1 == num3 && num1 == num4){
            System.out.println("All four are equals");
        }
        else
            System.out.println("All four are not equals");
    }
}
