 import java.util.Scanner;
 public class calculatecgst
     {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the product price: ");
            double price = scanner.nextDouble();

            double cgst = (9.0 / 100) * price;
            double sgst = (11.0 / 100) * price;
            double totalPrice = price + cgst + sgst;

            System.out.println("CGST: " + cgst);
            System.out.println("SGST: " + sgst);
            System.out.println("Total Price to Pay: " + totalPrice);
            scanner.close();
        }
    }


