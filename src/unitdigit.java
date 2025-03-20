import java.util.Scanner;

public class unitdigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int unitDigit = num % 10;
        System.out.println("Unit digit: " + unitDigit);
        scanner.close();
    }
}

