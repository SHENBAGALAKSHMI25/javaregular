import java.util.Scanner;

    public class fraction {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first decimal number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second decimal number: ");
            double num2 = scanner.nextDouble();

            double fractionSum = (num1 + num2) - ((int) (num1 + num2));
            System.out.println("Fraction sum: " + fractionSum);
            scanner.close();
        }
    }


