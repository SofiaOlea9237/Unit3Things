
public class BankAccount
{
    private double balance;
    public BankAccount()
    {
        balance = 1987;
    }
    public BankAccount (double MyMoney)
    {
        balance = MyMoney;
    }
    public void Deposit (double amount)
    {
        balance = balance + amount;
    }
    public void Withdraw (double amount)
    {
        balance = balance - amount;
    }
    public double NewBalance()
    {
        return balance;
    }
}
