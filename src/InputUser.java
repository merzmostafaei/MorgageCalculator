import java.util.Scanner;

public class InputUser {
    private double principal;
    private double annualInterestRate;
    private int years;
    Scanner scanner = new Scanner(System.in);
    // Getters
    public double getPrincipal() {
        return principal;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getYears() {
        return years;
    }

    // Read user input and set values


    // Set fields with validation
    // All input + validation happens here
    public void setDetails() {


        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter loan amount (principal): ");
            double p= scanner.nextDouble();

            System.out.print("Enter annual interest rate (in %): ");
            double r = scanner.nextDouble();

            System.out.print("Enter loan period (in years): ");
            int y = scanner.nextInt();

            isValid = true;

            if (p > 1000 && p < 1_000_000) {
                this.principal = p;
            } else {
                System.out.println("❌ Error: principal must be > 1000 and < 1,000,000");
                isValid = false;
            }

            if (r > 0 && r < 100) {
                this.annualInterestRate = r;
            } else {
                System.out.println("❌ Error: annual interest rate must be > 0 and < 100");
                isValid = false;
            }

            if (y > 0 && y < 30) {
                this.years = y;
            } else {
                System.out.println("❌ Error: years must be > 0 and < 30");
                isValid = false;
            }

            if (isValid) {
                System.out.println("✅ Set successfully.");
            } else {
                System.out.println("🔁 Please enter values again.");
            }
        }

        // Optional: scanner.close(); (Only if you're done using System.in in your whole program)
    }


}