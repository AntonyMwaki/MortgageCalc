import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (%): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the loan term (in years): ");
        int loanTermInYears = scanner.nextInt();

        // Calculate monthly interest rate
        double monthlyInterestRate = (annualInterestRate / 100) / 12;

        // Calculate number of monthly payments
        int numberOfPayments = loanTermInYears * 12;

        // Calculate mortgage payment
        double mortgagePayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        // Display the mortgage payment
        System.out.printf("Your monthly mortgage payment is: $%.2f%n", mortgagePayment);

        scanner.close();
    }
}
