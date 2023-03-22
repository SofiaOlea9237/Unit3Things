
public class BankAccount
{
    private double PersonsMoney;
    private double MoneyOut;
    private double MoneyIn;

    public BankAccount()
    {
        PersonsMoney = 1987;
    }
    public void RecordMoneyIn (double amount)
    {
        PersonsMoney = PersonsMoney+amount;
    }
    public void RecordMoneyOut (double amount)
    {
        PersonsMoney = PersonsMoney-amount;
    }
}
