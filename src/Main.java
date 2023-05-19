public class Main {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100:");

        // Check each number from 1 to 100
        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;

            // Check if the number is divisible by any number from 2 to number-1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If the number is prime, print it
            if (isPrime) {
                System.out.print(number);
            }
        }
    }
}
