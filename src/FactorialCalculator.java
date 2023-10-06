import java.util.Scanner; // Import the Scanner class to read user input

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user

        System.out.print("Enter an integer to calculate its factorial: ");
        if (scanner.hasNextInt()) { // Check if the input is a valid integer
            int n = scanner.nextInt(); // Read the integer provided by the user
            long factorial = calculateFactorial(n); // Calculate the factorial

            System.out.println(n + "! = " + factorial); // Display the factorial result
        } else {
            System.out.println("Invalid input. Please enter a valid integer."); // Display an error message for invalid input
        }

        scanner.close(); // Close the Scanner to release resources
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            return -1; // Negative numbers don't have factorials
        } else if (n == 0 || n == 1) {
            return 1; // Factorial of 0 and 1 is 1
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i; // Calculate the factorial by multiplying from 2 to n
            }
            return factorial;
        }
    }
}
