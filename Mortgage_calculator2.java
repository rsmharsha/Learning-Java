import java.util.Scanner;

public class Mortgage_calculator2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int principal = 0;
        float  monthlyInterest = 0;
        int numberOfPayements = 0;

        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >=1000 && principal <=1_000_000)
                break;
            System.out.println("Enter a value betwee 1000 and 1000000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <=30){
                monthlyInterest = annualInterest / 100 / 12;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while (true){
            System.out.print("Period(Years): ");
            byte years = scanner.nextByte();
            if(years >= 1 && years <= 30){
                numberOfPayements = years * 12;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        // Mortgage Formula
        double Mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayements)) / (Math.pow(1 + monthlyInterest, numberOfPayements) - 1);

        System.out.println("Mortgage: " + Mortgage);


    }
}
