 public class CheckingAccount extends BankAccount {
    private double interestRate;

    public CheckingAccount(double interestRate) {
        super();
        this.interestRate = interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void processWithdrawal(double amount) {
        double newBalance = getBalance() - amount;
        if (newBalance < 0) {
            amount += 30.0;  
            System.out.println("Overdraft fee.");
        }
        withdrawal(amount); 
    }

    public void displayAccount() {
        accountSummary();  
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
