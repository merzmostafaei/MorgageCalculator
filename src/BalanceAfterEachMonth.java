public class BalanceAfterEachMonth {
    private double principal;
    private double annualInterestRate;
    private int years;
    private double monthlyPayment;

    // Setters
    public void setLoanDetails(double principal, double annualInterestRate, int years, double monthlyPayment) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.years = years;
        this.monthlyPayment = monthlyPayment;
    }

    // Method to print balance after each month
    public void printBalanceSchedule() {
        int totalPayments = years * 12;
        double monthlyInterestRate = annualInterestRate / 100.0 / 12.0;

        System.out.println("\nBalance after each month:");
        for (int month = 1; month <= totalPayments; ++month) {
            double balance = principal * Math.pow(1.0 + monthlyInterestRate, totalPayments)
                    - monthlyPayment * (Math.pow(1.0 + monthlyInterestRate, month) - 1.0) / monthlyInterestRate;
            System.out.printf("Month %3d: $%.2f%n", month, balance);
        }
    }
}
