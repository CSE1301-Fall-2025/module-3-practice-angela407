package pastexam;
public class ExamOneArrayExamples { // array examples
    public static void main(String[] args) {
        int[] highScores; // declare an array variable
        highScores = new int[5]; // create array (5 spots in array)
        highScores[0] = 99; // assign new value of 99 to 1st element of the array
        System.out.println(highScores[0]); // print the 1st elelment of the array
        double[] scores = new double[7]; // declare and create array in 1 step
        String[] names = {"Jamal", "Emily", "Sofia"}; // create array using initializer list
        System.out.println(names[1]); // print out 2nd element of "names" array
        for (int i = 0; i < names.length; i++) { // traversing array with for loop
            System.out.println(names[i]); // prints out all element in "names" array
        }
        int[][] ticketInfo = new int[2][3]; // create new 2D array
        String[][] randLetters = {{"M", "O"}, {"A", "L"}, {"E", "K"}}; /* create 
        2D array with initializer list*/
        System.out.println("Letter in row 1, col 0: " + randLetters[1][0]); /*
        prints out: Letter in row 1, col 0: A */
    }
}
