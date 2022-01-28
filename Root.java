/*
Name: Jonathan Pestinger
Class Number: CIS221
Time: Tuesdays and Thursdays at 2:10pm
Period: Spring 2022
*/

public class Root { // Root Class - used to print results to the console

    public static void main(String[] args) { // Main method
        Main result = new Main();   // Create object of Main class 
                                    // Used to call the constructor
        System.out.println("Here are the results from 2 die rolls:\n");
        System.out.println("First roll: " + result.die1);
        System.out.println("Second roll: " + result.die2);
        System.out.println("\nHere is the sum of the 2 die rolls:\n");
        System.out.println("Sum: " + result.sum);
    }

}