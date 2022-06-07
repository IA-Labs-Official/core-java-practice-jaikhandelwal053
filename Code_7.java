//Take three numbers from the user and print the greatest number

import java.util.Scanner;

// import javax.lang.model.util.ElementScanner6;
public class Code_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three number:");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        if (n1>n2 && n1>n3) {
            System.out.println(n1 +" is Greatest number");
        } else if(n2>n1 && n2>n3) {
            System.out.println(n2 +" is Greatest number");
        }
        else{
            System.out.println(n3 +" is Greatest number");
        }
    }
}
