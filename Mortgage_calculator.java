import java.util.Scanner;

public class Mortgage_calculator {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = scanner2.nextDouble();

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Period (Years): ");
        int period = scanner3.nextInt();

        // Number of payments
        int n = period * 12;

        // monthly interest rate
        double r = annualInterestRate / 100 / 12;

        // Calculate the monthly mortgage payment
        double Mortgage = principal * (r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);

        System.out.println("Mortgage: " + Mortgage);
    }
}

