public class Test {
    public static void main(String[] args) {
        // Test BankAccount
        BankAccount first = new BankAccount();
        first.setFirstName("Frank");
        first.setLastName("McGowan");
        first.setAccountID(56789);
        first.deposit(100000.0);
        first.accountSummary();

        System.out.println();

        // Test CheckingAccount
        CheckingAccount overdraft = new CheckingAccount(3.0);
        overdraft.setFirstName("Mike");
        overdraft.setLastName("Jones");
        overdraft.setAccountID(23456);
        overdraft.deposit(1000.0);
        overdraft.processWithdrawal(1200.0);
        overdraft.displayAccount();
    }
}
