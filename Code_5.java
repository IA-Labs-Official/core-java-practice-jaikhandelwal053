//Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product, the average,
// the distance (the difference between integer), the maximum (the larger of the two integers), the minimum (smaller of the two integers).
import java.util.Scanner;
public class Code_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int avg = (a+b)/2;
        int dis = Math.abs(a-b);
        int max, min;
       if (a>b) {
           max = a;
           min = b;
       } else {
            max = b;
            min = a;
       }


       System.out.println("Addition of two number: " + add);
       System.out.println("Subtraction of two number: " + sub);
       System.out.println("Multiplication of two number: " + mul);
       System.out.println("Divition of two number: " + div);
       System.out.println("Average of two number: " + avg);
       System.out.println("Distance of two number: " + dis);
       System.out.println("Maximum of two number: " + max);
       System.out.println("Minimum of two number: " + min);

    }
}
