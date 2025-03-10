 import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
 public class sum
     {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter birth year: ");
            int year = scanner.nextInt();
            System.out.print("Enter birth month: ");
            int month = scanner.nextInt();
            System.out.print("Enter birth day: ");
            int day = scanner.nextInt();

            LocalDate birthDate = LocalDate.of(year, month, day);
            LocalDate currentDate = LocalDate.now();
            Period age = Period.between(birthDate, currentDate);

            System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");
            scanner.close();
        }
    }


