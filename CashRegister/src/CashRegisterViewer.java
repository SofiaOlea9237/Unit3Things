import javax.swing.*;

public class CashRegisterViewer
{
    public static void main(String[] args)
    {
        CashRegister register = new CashRegister();

        double PurchaseMoney = Double.parseDouble(JOptionPane.showInputDialog("Amount of the " +
                "purchase"));
        register.RecordPurchase(PurchaseMoney);

        double PaymentMoney = Double.parseDouble(JOptionPane.showInputDialog("Amount you " +
                "will pay"));
        register.ReceivePayment(PaymentMoney);

        double change = register.GiveChange();

        System.out.println("Purchase: $"+PurchaseMoney);
        System.out.println("Received: $"+PaymentMoney);
        System.out.println("------------------------");
        System.out.println("Change: $"+change);


    }
}
