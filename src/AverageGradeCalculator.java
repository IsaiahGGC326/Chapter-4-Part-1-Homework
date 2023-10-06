import java.util.Scanner; // Import the Scanner class to read user input

public class AverageGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user
        int totalGrades = 0; // Initialize a variable to keep track of the total grades
        int numberOfGrades = 0; // Initialize a variable to keep track of the number of grades entered

        System.out.println("Enter student grades (enter any non-numeric character to stop):");

        while (scanner.hasNextInt()) { // Check if the input is a valid integer
            int grade = scanner.nextInt(); // Read the grade provided by the user
            totalGrades += grade; // Add the grade to the total
            numberOfGrades++; // Increment the count of grades entered
        }

        if (numberOfGrades > 0) { // Check if at least one grade was entered
            double average = (double) totalGrades / numberOfGrades; // Calculate the average grade
            System.out.println("Average grade in the class: " + average); // Display the average grade
        } else {
            System.out.println("No grades were entered."); // Display a message if no grades were entered
        }

        scanner.close(); // Close the Scanner to release resources
    }
}

