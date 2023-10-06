import java.util.Scanner; // Import the Scanner class to read user input

public class HighLowGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user
        int highestGrade = Integer.MIN_VALUE; // Initialize a variable to keep track of the highest grade
        int lowestGrade = Integer.MAX_VALUE; // Initialize a variable to keep track of the lowest grade

        System.out.println("Enter student grades (enter any non-numeric character to stop):");

        while (scanner.hasNextInt()) { // Check if the input is a valid integer
            int grade = scanner.nextInt(); // Read the grade provided by the user
            if (grade > highestGrade) { // Check if the current grade is higher than the highest grade so far
                highestGrade = grade; // Update the highest grade
            }
            if (grade < lowestGrade) { // Check if the current grade is lower than the lowest grade so far
                lowestGrade = grade; // Update the lowest grade
            }
        }

        if (highestGrade != Integer.MIN_VALUE && lowestGrade != Integer.MAX_VALUE) {
            // Check if at least one grade was entered
            System.out.println("Highest grade in the class: " + highestGrade); // Display the highest grade
            System.out.println("Lowest grade in the class: " + lowestGrade); // Display the lowest grade
        } else {
            System.out.println("No grades were entered."); // Display a message if no grades were entered
        }

        scanner.close(); // Close the Scanner to release resources
    }
}
