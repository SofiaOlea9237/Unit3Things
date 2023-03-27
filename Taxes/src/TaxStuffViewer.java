//NO SIRVEEEEEE
import javax.swing.*;

public class TaxStuffViewer
{
    public static void main(String[] args)
    {
        TaxStuff OmgImGettingTaxed = new TaxStuff();

        double PurchaseMoney = Double.parseDouble(JOptionPane.showInputDialog("Amount of the " +
                "purchase"));
        OmgImGettingTaxed.RecordPurchase(PurchaseMoney);

        double PaymentMoney = Double.parseDouble(JOptionPane.showInputDialog("Amount you " +
                "will pay"));
        OmgImGettingTaxed.ReceivePayment(PaymentMoney);

        double change = OmgImGettingTaxed.GiveChange();

        System.out.println("Purchase: $"+PurchaseMoney);
        System.out.println("Received: $"+PaymentMoney);
        System.out.println("------------------------");
        System.out.println("Change: $"+change);


    }
}
