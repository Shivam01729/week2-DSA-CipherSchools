import java.io.*;
import java.util.Scanner;

class Lecture_21{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name:");
        // String s=sc.next();   
        //It will stop taking input after when we enter space or on lcicking space bar and next input will try to assign to another input variable
        // String s=sc.nextLine();
        // System.out.println("name is:"+" "+s);
        String fname=sc.next();
        String lname=sc.next();
        System.out.print("Please enter your profession:");
        String prof=sc.next();
        System.out.print("Please enter your Country:");
        sc.nextLine();
        String country=sc.nextLine();
        System.out.print("Please enter your Housenumber:");
        int h=sc.nextInt();
        //while usinh this if we dont move coutser to nextline by using sc.nextLine() than wnot take input for next string or use parser
        // int h=Integer.parseInt(sc.nextLine());
        int x=sc.nextInt();
        sc.nextLine();
        System.out.print("Please enter your village:");
        String village=sc.nextLine();
        System.out.println("First name is: "+fname); 
        System.out.println("Last name is: "+lname);
        System.out.println("Profession is: "+prof);
        System.out.println("Country is: "+country);
        System.out.println("House number is: "+h);
        System.out.println("Village is:"+village+" "+ x);
    }
}