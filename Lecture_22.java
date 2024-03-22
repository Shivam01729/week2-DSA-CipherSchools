import java.io.*;
import java.util.Scanner;

public class Lecture_22{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter thr size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter "+ (i+1) +" element");
            arr[i]=sc.nextInt();
        }
        System.out.print("The array elements are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        // sc.close();
        //if we close it like this than we cannot take input woith other scanner object also
        Scanner sk=new Scanner(System.in);
        System.out.println("enter k");
        int k=sk.nextInt();
        System.out.println("k is "+ k);
    }
}