public class printSpattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == (n / 2)+1 || i == n) {
                System.out.println("*".repeat(n));
            } else if (i <=n / 2) {
                System.out.println("*");
            } else {
                System.out.println(" ".repeat(n - 1) + "*");
            }
        }
    }
}






