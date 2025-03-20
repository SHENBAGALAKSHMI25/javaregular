 import java.util.Scanner;
 public class calculate
    {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int totalMarks = 0, maxMarks = 500;

            System.out.println("Enter marks for 5 subjects (out of 100): ");
            for (int i = 0; i < 5; i++) {
                totalMarks += scanner.nextInt();
            }

            double percentage = (totalMarks * 100.0) / maxMarks;
            System.out.println("Aggregate Marks: " + totalMarks);
            System.out.println("Percentage: " + percentage + "%");

        }
    }


