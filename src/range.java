 import java.util.Scanner;
    public class range {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String result = (n % 2 != 0) ? "weird" : (n >= 2 && n <= 5) ? "not weird" : (n >= 6 && n <= 20) ? "weird" : "not weird";
            System.out.println(result);
        }
    }
