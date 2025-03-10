import java.util.Scanner;
public class rangee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 != 0) {
            System.out.print("Wierd");
        } else {
        if (n >= 2 && n <= 5) {
                System.out.println("not wierd");
            } else if (n >= 6 && n <= 20) {
                System.out.println("wierd");
            } else if (n > 20) {
                System.out.println("not wierd");
            }
        }
    }
}
