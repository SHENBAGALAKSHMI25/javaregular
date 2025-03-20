 import java.util.Scanner;
    public class steel {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            float c=sc.nextFloat();
            int ts=sc.nextInt();
            char output=(n>60 && c>0.8 && ts>5700)?'A':(n>60 && c>0.8)?'B':(n>60 && ts>5700)?'C':(c>0.8 && ts>5700)?'D':(n>60 || c>0.8 || ts>5700)?'E':'F';
        System.out.println(output);
        }

}
