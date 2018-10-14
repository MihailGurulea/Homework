class SavingsAccount {
    private static int annualInterestRate;
    private Double savingsBalance;

    double getSavingsBalance() {
        return savingsBalance;
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
