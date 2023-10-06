import java.util.Scanner; // Import the Scanner class to read user input

public class SumOfDigitsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user

        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) { // Check if the input is a valid integer
            int number = scanner.nextInt(); // Read the integer provided by the user
            int sum = calculateSumOfDigits(number); // Calculate the sum of digits

            System.out.println("Sum of the digits: " + sum); // Display the sum of digits
        } else {
            System.out.println("Invalid input. Please enter a valid integer."); // Display an error message for invalid input
        }

        scanner.close(); // Close the Scanner to release resources
    }

    public static int calculateSumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the last digit
        }

        return sum;
    }
}
