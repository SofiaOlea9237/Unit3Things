import javax.swing.*;

public class CashRegisterViewer
{
    public static void main(String[] args)
    {
        CashRegister MyCashRegister = new CashRegister();

        double PurchaseMoney = Double.parseDouble(JOptionPane.showInputDialog("Amount of the " +
                "purchase"));
        MyCashRegister.RecordPurchase(PurchaseMoney);

        double PaymentMoney = Double.parseDouble(JOptionPane.showInputDialog("Amount you " +
                "will pay"));
        MyCashRegister.ReceivePayment(PaymentMoney);

        double change = MyCashRegister.GiveChange();

        System.out.println("Purchase: $"+PurchaseMoney);
        System.out.println("Received: $"+PaymentMoney);
        System.out.println("------------------------");
        System.out.println("Change: $"+change);


    }
}
