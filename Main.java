/*
Name: Jonathan Pestinger
Class Number: CIS221
Time: Tuesdays and Thursdays at 2:10pm
Period: Spring 2022
*/

public class Main { // Main Class - Used to declare variables

    // Class Attributes
    int sum;
    int die1;
    int die2;

    public Main() { // Class Constructor
        die1 = Roll.roll(); // Call "roll" method from Roll Class
        die2 = Roll.roll(); // "roll" method used to generate an integer
                            // 1-6 to simulate the die roll set both
                            // variables equal to their own unique rolls
        sum = die1 + die2;  // Manipulate the data by adding both rolls together
    }
    
}