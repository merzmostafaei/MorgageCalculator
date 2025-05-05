
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var inputUser = new InputUser();
        inputUser.setDetails();


        var monthPayment = new MonthPayment();
        monthPayment.setMonthPayment(
                inputUser.getPrincipal(),
                inputUser.getAnnualInterestRate(),
                inputUser.getYears()
        );
        monthPayment.calculate();
        System.out.printf("Monthly Mortgage Payment: $%.2f%n", monthPayment.getMonthlyPayment());

        var balance = new BalanceAfterEachMonth();
        balance.setLoanDetails(
                inputUser.getPrincipal(),
                inputUser.getAnnualInterestRate(),
                inputUser.getYears(),
                monthPayment.getMonthlyPayment()
        );
        balance.printBalanceSchedule();
    }
}
