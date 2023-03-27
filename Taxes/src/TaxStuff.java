//NO SIRVEEEEEEE
public class TaxStuff
{
    private double purchase;
    private double payment;
    private double tax;

    public TaxStuff()
    {
        purchase = 0;
        payment = 0;
        tax = 0.10;
    }
    public void RecordPurchase(double amount)
    {
        purchase = (purchase*tax) + amount;
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
