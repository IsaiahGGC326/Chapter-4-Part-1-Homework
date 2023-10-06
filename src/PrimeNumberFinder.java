import java.util.Scanner; // Import the Scanner class to read user input

public class PrimeNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user

        System.out.print("Enter an integer: "); // Prompt the user to enter an integer

        if (scanner.hasNextInt()) { // Check if the input is a valid integer
            int number = scanner.nextInt(); // Read the integer provided by the user

            if (isPrime(number)) { // Call the isPrime function to check if the number is prime
                System.out.println(number + " is a prime number"); // Display the result if it's prime
            } else {
                System.out.println(number + " is not a prime number"); // Display the result if it's not prime
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer."); // Display an error message for invalid input
        }

        scanner.close(); // Close the Scanner to release resources
    }

    public static boolean isPrime(int number) {
        if (number <= 1) { // Check if the number is less than or equal to 1 (not prime)
            return false;
        } else if (number <= 3) { // Check if the number is 2 or 3 (prime)
            return true;
        } else if (number % 2 == 0 || number % 3 == 0) { // Check if the number is divisible by 2 or 3 (not prime)
            return false;
        } else {
            int i = 5;
            while (i * i <= number) {
                if (number % i == 0 || number % (i + 2) == 0) { // Check divisibility by numbers of the form 6k ± 1
                    return false; // If divisible, the number is not prime
                }
                i += 6; // Increment i by 6 to check the next potential divisors
            }
            return true; // If no divisors are found, the number is prime
        }
    }
}
