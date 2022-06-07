//3) Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.
import java.util.Arrays;
import java.util.Scanner;
public class Code_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter Kth position");

        int k = sc.nextInt();
        Arrays.sort(arr);

        for(int i=arr.length-1; i>k; i--){
            System.out.println(arr[i]);
        }
    }
}
