import java.util.Scanner;

class MagicNumber {
    // Function to compute the sum of digits until a single-digit result
    static int sumOfDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = sumOfDigits(num);

        if (result == 1) {
            System.out.println(num + " is a Magic Number.");
        } else {
            System.out.println(num + " is NOT a Magic Number.");
        }
        sc.close();
    }
}
