/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.nwmissouri.guessmynumber;

import javax.swing.JOptionPane;

/**
 *
 * @author Pavan Kumar Atmakuri
 */
public class GussingGameAtmakuri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO: change securNumber to secretNumber Hint: Right-click / Refactor / Rename
        int securNumber = (int) (Math.random() * 100 + 1);
        int userAnswer = 0;
        System.out.println("The correct guess would be " + securNumber);
        int count = 1;

        while (userAnswer != securNumber) {
            // TODO: create 3 local variables for the arguments so we know what they mean
            // showInputDialog - the first argument is always null (no parent)
            // message = "Enter a guess between 1 and 100" // what type?
            // title = "Guessing Game" // what type?
            // messageType = JOptionPane.INFORMATION_MESSAGE
            // Works the same as original 3 but more expressive - this is an example of a what? Hint: enum
            String response = JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 100", "Guessing Game", 3);
            userAnswer = Integer.parseInt(response);

            JOptionPane.showMessageDialog(null, "" + calculateMessage(userAnswer, securNumber, count));
            count++;
        }
    }

    // TODO: Refactor / Rename determineGuess to calculateMessage
    public static String calculateMessage(int userAnswer, int securNumber, int count) {
        // TODO: Instead of "Try Number" which sounds like we should try that as a guess...
        // Say "You've used " + count + guesses.
        // If count is one, use "guess", else use "guesses" HINT: Ternary operator
        if (userAnswer <= 0 || userAnswer > 100) {
            return "Your securNumber is invalid";
        } else if (userAnswer == securNumber) {
            return "Correct!\nTotal securNumber: " + count;
        } else if (userAnswer > securNumber) {
            return "Your securNumber is too high, try again.\nTry Number: " + count;
        } else if (userAnswer < securNumber) {
            return "Your securNumber is too low, try again.\nTry Number: " + count;
        } else {
            return "Your securNumber is incorrect\nTry Number: " + count;
        }
    }
    
}
