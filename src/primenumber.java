public class primenumber {
    public static void main(String[] args) {
        int num = 2; // Change this to any number
        while (!(isPrime(++num) ? true : false));
        System.out.println("Next prime: " + num);
    }

    static boolean isPrime(int n) {
        return (n < 2) ? false : checkPrime(n,2);
    }

    static boolean checkPrime(int n, int i) {
        return (i * i > n) ? true : (n % i == 0) ? false : checkPrime(n, i + 1);
    }
}


