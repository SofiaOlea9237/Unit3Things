import javax.swing.*;

public class BankPeasants
{
    public static void main(String[] args)
    {
        BankAccount MyBankAccount = new BankAccount();

        double DepositMoney = Double.parseDouble(JOptionPane.showInputDialog("Amount of" +
                "your deposit (You can say 0)"));
        MyBankAccount.Deposit(DepositMoney);

        double WithdrawMoney = Double.parseDouble(JOptionPane.showInputDialog("Amount of your" +
                "withdraw (You can say 0 as well)"));

        System.out.println("");
    }
}
