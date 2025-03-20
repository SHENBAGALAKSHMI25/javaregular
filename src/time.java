import java.util.Scanner;

    public class time {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number of days: ");
            int days = scanner.nextInt();

            int hours = days * 24;
            int minutes = hours * 60;
            int seconds = minutes * 60;

            System.out.println(days + " days = " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
            scanner.close();
        }
    }


