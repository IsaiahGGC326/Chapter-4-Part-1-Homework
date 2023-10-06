import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (isPrime(number)) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else if (number <= 3) {
            return true;
        } else if (number % 2 == 0 || number % 3 == 0) {
            return false;
        } else {
            int i = 5;
            while (i * i <= number) {
                if (number % i == 0 || number % (i + 2) == 0) {
                    return false;
                }
                i += 6;
            }
            return true;
        }
    }
}
