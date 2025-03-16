import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Currency Converter!");

        // Conversion rates (example rates, you can update them)
        double usdToInr = 81.0;
        double eurToInr = 88.0;
        double gbpToInr = 100.0;
        double inrToUsd = 0.012;
        double inrToEur = 0.011;
        double inrToGbp = 0.010;

        // Display conversion options
        System.out.println("Select the conversion type:");
        System.out.println("1. USD to INR");
        System.out.println("2. EUR to INR");
        System.out.println("3. GBP to INR");
        System.out.println("4. INR to USD");
        System.out.println("5. INR to EUR");
        System.out.println("6. INR to GBP");

        System.out.print("Enter your choice (1-6): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        double convertedAmount = 0;
        boolean validChoice = true;

        // Perform the conversion based on user choice
        switch (choice) {
            case 1:
                convertedAmount = amount * usdToInr;
                System.out.printf("Converted Amount: %.2f USD = %.2f INR\n", amount, convertedAmount);
                break;
            case 2:
                convertedAmount = amount * eurToInr;
                System.out.printf("Converted Amount: %.2f EUR = %.2f INR\n", amount, convertedAmount);
                break;
            case 3:
                convertedAmount = amount * gbpToInr;
                System.out.printf("Converted Amount: %.2f GBP = %.2f INR\n", amount, convertedAmount);
                break;
            case 4:
                convertedAmount = amount * inrToUsd;
                System.out.printf("Converted Amount: %.2f INR = %.2f USD\n", amount, convertedAmount);
                break;
            case 5:
                convertedAmount = amount * inrToEur;
                System.out.printf("Converted Amount: %.2f INR = %.2f EUR\n", amount, convertedAmount);
                break;
            case 6:
                convertedAmount = amount * inrToGbp;
                System.out.printf("Converted Amount: %.2f INR = %.2f GBP\n", amount, convertedAmount);
                break;
            default:
                validChoice = false;
                System.out.println("Error: Invalid choice. Please select a valid option.");
        }

        // Thank the user
        if (validChoice) {
            System.out.println("Thank you for using the Currency Converter!");
        }

        scanner.close();
    }
}
