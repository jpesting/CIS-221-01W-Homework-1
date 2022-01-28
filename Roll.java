/*
Name: Jonathan Pestinger
Class Number: CIS221
Time: Tuesdays and Thursdays at 2:10pm
Period: Spring 2022
*/

public class Roll { // Roll Class - Used to simulate dice rolls

    public static int roll() { // "roll" method - generate a random integer (1-6)
        int result = (int)(Math.random() * 7);
        if (result == 0) {
            return roll();
        }
        return result;
    }

}