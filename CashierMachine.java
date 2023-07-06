import java.util.Scanner;

public class CashierMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of products: ");
        int totalProducts = scanner.nextInt();

        double totalPrice = 0.0;

        for (int i = 1; i <= totalProducts; i++) {
            System.out.println("\nProduct " + i + ":");
            System.out.print("Enter the product name: ");
            String productName = scanner.next();

            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Enter the price per unit: ");
            double price = scanner.nextDouble();

            double productTotal = quantity * price;
            System.out.println("Total for Product " + i + ": $" + productTotal);

            totalPrice += productTotal;
        }

        System.out.println("\nTotal Price: $" + totalPrice);

        System.out.print("Enter the amount paid: ");
        double amountPaid = scanner.nextDouble();

        double change = amountPaid - totalPrice;
        System.out.println("Change: $" + change);

        scanner.close();
    }
}
