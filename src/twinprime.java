
    import java.util.Scanner;

    public class twinprime {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Taking input from user
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Check if numbers are twin numbers
            if (Math.abs(num1 - num2) == 2) {
                System.out.println(num1 + " and " + num2 + " are Twin Numbers.");
            } else {
                System.out.println(num1 + " and " + num2 + " are NOT Twin Numbers.");
            }

            scanner.close();
        }
    }


