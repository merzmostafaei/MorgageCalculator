public class MonthPayment {
    private double principal;
    private double annualInterestRate;
    private int years;
    private double monthlyPayment;


    // Setters
    public void setMonthPayment(double principal, double annualInterestRate, int years) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.years = years;
    }

    // Method to calculate monthly payment
    public void calculate() {
        int totalPayments = years * 12;
        double monthlyInterestRate = annualInterestRate / 100.0 / 12.0;

        if (monthlyInterestRate > 0.0) {
            this.monthlyPayment = principal * monthlyInterestRate *
                    Math.pow(1.0 + monthlyInterestRate, totalPayments) /
                    (Math.pow(1.0 + monthlyInterestRate, totalPayments) - 1.0);
        } else {
            this.monthlyPayment = principal / totalPayments;
        }
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }
}
