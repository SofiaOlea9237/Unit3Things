import javax.swing.*;

public class BankPeasants
{
    public static void main(String[] args)
    {
        BankAccount MyBankAccount = new BankAccount();

        //remember that you have $2550
        double DepositMoney = Double.parseDouble(JOptionPane.showInputDialog("Amount of" +
                "your deposit (You can say 0)"));

        MyBankAccount.Deposit(DepositMoney);


        double WithdrawMoney = Double.parseDouble(JOptionPane.showInputDialog("Amount of your" +
                "withdraw (You can say 0 as well)"));

        MyBankAccount.Withdraw(WithdrawMoney);


        double NewBalance = MyBankAccount.NewBalance();

        System.out.println("You made a deposit of: $"+DepositMoney);
        System.out.println("You withdrew an amount of: $"+WithdrawMoney);
        System.out.println("-----------------------------------");
        System.out.println("Your new balance is: $"+ NewBalance);

    }
}
