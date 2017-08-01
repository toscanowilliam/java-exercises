package org.launchcode.java.studios;
import java.util.Scanner;
public class Area {
    public static void main(String[] args)
    {
        double num;
        double area;
        double pi;  // Setting up variables types and names
        pi = 3.14;  // initializing variable
        Scanner in = new Scanner(System.in); //"in" is the reader variable
        System.out.print("Enter number: ");
        num = in.nextDouble(); //num = "in".nextVariableType
        while (num < 0)
        {
            System.out.print("Please enter a number equal or greater than 0: ");
            num = in.nextDouble();
        }
            area = (pi)*num*num;
            System.out.print(area);
    }
}
