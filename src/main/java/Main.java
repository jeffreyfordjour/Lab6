
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frys
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner keyboard = new Scanner(System.in);  // Create a Scanner object
         System.out.println("Enter your length for first Tract:  ");
         int length1 = keyboard.nextInt();
         System.out.println("Enter your width for first Tract:  ");
         int width1 = keyboard.nextInt();
         System.out.println("Enter your length for second Tract:  ");
         int length2 = keyboard.nextInt();
         System.out.println("Enter your width for second Tract:  ");
         int width2 = keyboard.nextInt();
         
         LandTract t1 = new LandTract(length1, width1);
         int area1 = t1.area();
         LandTract t2 = new LandTract(length2, width2);
         int area2 = t2.area();
         boolean equal = t1.equals(t2.area());
         
         
         System.out.println("Area of First Tract is: " + t1.toString());
         System.out.println("Area of Second Tract is: " + t2.toString());
         if(equal) {
            System.out.println("The area of both tracts are equal");
         } else {
            System.out.println("The area of both tracts are not equal");
         }


         

    }
    
}
