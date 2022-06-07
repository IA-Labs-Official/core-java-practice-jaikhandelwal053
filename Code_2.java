// Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.
import java.util.Scanner;

public class Code_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Double number: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        if (d1>0 && d1<1 && d2>0 && d2<1){
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}
