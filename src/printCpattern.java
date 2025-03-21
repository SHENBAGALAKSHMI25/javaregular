public class printIpattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=n ;j++){
                if (i == 1 || i == n || j==3 ) {
                    System.out.println("*".repeat(n));
            }

            }
            } else {
                System.out.println(" ".repeat(n - 1) + "*");
            }
        }
    }
}

