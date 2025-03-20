import java.util.Scanner;

public class mton  {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter M: ");
            int m = scanner.nextInt();
            System.out.print("Enter N: ");
            int n = scanner.nextInt();

            int sum = 0;
            for (int i = m; i <= n; i++) {
                sum += i;
            }

            System.out.println("Sum from " + m + " to " + n + " is: " + sum);
            scanner.close();
        }
    }


