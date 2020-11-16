
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

public class MonthMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner keyboard = new Scanner(System.in);  // Create a Scanner object
         System.out.println("Enter your Month Number:  ");
         Month m = new Month();
         m.setMonthNumber((1));
         String name = m.getMonthName(1);
         
         System.out.println("Your month is " + name);


         

    }
    
}
