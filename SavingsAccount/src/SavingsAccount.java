import java.math.BigDecimal;
import java.math.RoundingMode;

class SavingsAccount {
    private static int annualInterestRate;
    private Double savingsBalance;

    double getSavingsBalance() {
        return BigDecimal.valueOf(savingsBalance).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    SavingsAccount(Double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    void calculateMonthlyInterest() {
        this.savingsBalance = (((((double)annualInterestRate / 12) / 100) * savingsBalance) + savingsBalance);
    }

    static void modifyInterestRate(int annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }
}
