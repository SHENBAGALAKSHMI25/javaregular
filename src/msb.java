
import java.util.Scanner;

public class msb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        while (num >= 10) {
            num /= 10;
        }

        System.out.println("MSB digit: " + num);
        scanner.close();
    }
}
