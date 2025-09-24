package pastexam;
import java.util.Scanner; // scanner code
public class ExamOneCheatSheet {
    public static void main(String[] args) { // main method
        int score; // delaration of "score" variable
        score = 5; // variable initialization
        int hi = 2; // declaration + variable initialization in 1 step
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
        int test = (int)Math.random()*10; // random number between 0-9, not including 10
        if (test < 2) {
            System.out.println(test + " is less than 2");
        } else if (test == 2) { //make sure to use ==, not =
            System.out.println(test + " is equal to 2");
        } else { // don't need a boolean condition here!!!
            System.out.println(test + " is great than 2");
        }
        int loop = (int)(Math.random()*10)+1; // random number between 1-10 (initialize variable)
        while (loop > 0) { // test loop variable
            System.out.println("Hi!");
            loop--; // change loop variable
        }
        for (int i = 4; i < 10; i++) { // initialize variable; test varaible; change variable
            System.out.println ("Good luck!");
        }
    }
}
