public class FactorialCalculator {

    public static void main(String[] args) {
        int number = 5; // Example number
        int resul = factorial(number);
        Syste.out.lprintln("Factorial of " + number + " is: " + result);
    }

    public static int factoral(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }

