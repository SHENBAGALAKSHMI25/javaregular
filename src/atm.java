import java.util.Scanner;
public class atm
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number of ₹100 notes: ");
            int hundred = scanner.nextInt();
            System.out.print("Enter number of ₹500 notes: ");
            int fiveHundred = scanner.nextInt();
            System.out.print("Enter number of ₹1000 notes: ");
            int thousand = scanner.nextInt();

            int total = (hundred * 100) + (fiveHundred * 500) + (thousand * 1000);
            System.out.println("Total amount withdrawn: ₹" + total);
            scanner.close();
        }
    }


