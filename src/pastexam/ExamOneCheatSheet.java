package pastexam;

import java.util.Scanner; // scanner code
public class ExamOneCheatSheet {
    public static void main(String[] args) { // main method
        int score; // delaration of "score" variable
        score = 5; // variable initialization
        int hi = 2; // declaration + variable initialization
        System.out.print("Hello!");
        System.out.println("Print on same line as previous one");
        System.out.println("Print on next line");
        Scanner in = new Scanner(System.in); //scanner code
        System.out.println("How are you feeling today?"); // scanner example question
        String mood = in.nextLine(); // what you type in terminal is assigned to variable "mood"
        /* in.nextInt() scans your input as an int; in.nextDouble() scans your input as a double;
         * in.nextBoolean() scans your next input as a boolean
         */
        System.out.println("You feel " + mood + "!"); //concatenation
    }
}
