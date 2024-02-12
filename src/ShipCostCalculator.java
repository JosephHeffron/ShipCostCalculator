import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Input
        System.out.print("Enter the price of the item: $");
        double itemPrice = in.nextDouble();

        // Calculate shipping cost and total price
        double[] result = calculateShippingCost(itemPrice);
        // Shipping cost from the result array
        double shippingCost = result[0];
        // Total price from the result array
        double totalPrice = result[1];

        // Shipping cost with two decimal places
        System.out.printf("Shipping cost: $%.2f\n", shippingCost);
        // Total price with two decimal places
        System.out.printf("Total price: $%.2f\n", totalPrice);

        // Closing the scanner object to prevent resource leak
        in.close();
    }

    public static double[] calculateShippingCost(double itemPrice) {
        // Creating an array to store shipping cost and total price
        double[] result = new double[2];
        // If item price is $100 or more, shipping is free
        if (itemPrice >= 100) {
            result[0] = 0;
        } else {
            // If item price is less than $100, shipping cost is 2% of the item price
            result[0] = itemPrice * 0.02;
        }
        // Calculating the total price by adding item price and shipping cost
        result[1] = itemPrice + result[0];
        // Returning array with result
        return result;
    }
}
