public class FibonacciSeries {
    public static void main(String[] args) {
        // Initialize the first two values in the Fibonacci series
        long a = 0;
        long b = 1;

        // Define the number of Fibonacci terms to print
        int n = 30;

        // Print the first n Fibonacci terms
        System.out.println("First " + n + " Fibonacci terms:");

        for (int i = 0; i < n; i++) {
            // Print the current Fibonacci term (a)
            System.out.print(a + ", ");

            // Calculate the next Fibonacci term by adding the previous two terms (a and b)
            long next = a + b;

            // Update the values of a and b for the next iteration
            a = b;
            b = next;
        }

        // Print a newline to end the sequence
        System.out.println();
    }
}
