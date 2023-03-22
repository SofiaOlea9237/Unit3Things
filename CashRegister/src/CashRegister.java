public class CashRegister
{

    private double purchase;
    private double payment;

    public CashRegister()
    {
        purchase = 0;
        payment = 0;
    }

    public void RecordPurchase(double amount)
    {
        purchase = purchase + amount;
    }

    public void ReceivePayment(double amount)
    {
        payment = payment + amount;
    }

    public double GiveChange()
    {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
}
