class BankAccount {
    private String accountNumber;
    private double balance;
    
    public void setAccountNumber(String acc) { accountNumber = acc; }
    public String getAccountNumber() { return accountNumber; }
    public void setBalance(double bal) { balance = bal; }
    public double getBalance() { return balance; }
    
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccountNumber("12345");
        acc.setBalance(1000);
        System.out.println("Account: " + acc.getAccountNumber() + ", Balance: " + acc.getBalance());
    }
}
