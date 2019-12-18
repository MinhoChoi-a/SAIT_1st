
import java.util.*;
/**
 * ATM - Write a description here.
 * 
 * @author (MINHO CHOI)
 * @version (a version number or a date)
 */
public class ATM
{
    public static void main (String [] args)
    {
        String name;
        int chqAcctNum, savAcctNum, option=0;
        double chqBal, savBal, withdraw, deposit, transfer;
        boolean check;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        name = input.nextLine();
        System.out.print("Enter Chq Acct Num: ");
        chqAcctNum = input.nextInt();
        System.out.print("Enter Chq Acct Balance: ");
        chqBal = input.nextDouble();
        System.out.print("Enter Saving Acct Num: ");
        savAcctNum = input.nextInt();
        System.out.print("Enter Saving Acct Balance: ");
        savBal = input.nextDouble();

        BankSystem atm = new BankSystem(name, chqAcctNum, chqBal, savAcctNum, savBal);

        System.out.println("Current status:");
        System.out.println(atm);

        while(option!=7)
        {
            System.out.println("\n1. Withdraw from Chequing\n"+"2. Deposit to chequing\n"+
                "3. Withdraw from Saving\n"+"4. Deposit to Saving\n"+
                "5. Transfer from saving to chequing\n"+
                "6. Transfer from Chequing to Saving\n"+
                "7. Exit");
            System.out.print("Enter Slection: ");
            option = input.nextInt();

            if(option==1)
            {
                System.out.print("Amount to withdraw: ");
                withdraw = input.nextDouble();
                if(atm.withdrawChequing(withdraw))
                {
                    System.out.println(atm);
                }
                else
                {
                    System.out.println("Insufficient Funds in Chequing!");
                    System.out.println(atm);
                }   
                // Write your code here!!!!
            }

            else if(option==2)
            {
                System.out.print("Amount to chequing: ");
                deposit = input.nextDouble();
                atm.depositChequing(deposit);
                System.out.println(atm);
            }

            else if(option==3)
            {
                System.out.print("Amount to withdraw: ");
                withdraw = input.nextDouble();
                if(atm.withdrawSaving(withdraw))
                {
                    System.out.println(atm);
                }
                else
                {
                    System.out.println("Insufficient Funds in Saving!");
                    System.out.println(atm);
                } 
            }

            else if(option==4)
            {
                System.out.print("Amount to saving: ");
                deposit = input.nextDouble();
                atm.depositSaving(deposit);
                System.out.println(atm);
            }

            else if(option==5)
            {
                System.out.print("Amount to transfer from saving to chequing: ");
                transfer = input.nextDouble();
                if(atm.transferToChequing(transfer))
                {
                    System.out.println(atm);
                }
                else
                {
                    System.out.println("Insufficient Funds in Chequing to transfer");
                    System.out.println(atm);
                }
            }
            else if(option==6)
            {
                System.out.print("Amount to transfer from chequing to saving: ");
                transfer = input.nextDouble();
                if(atm.transferToSaving(transfer))
                {
                    System.out.println(atm);
                }
                else
                {
                    System.out.println("Insufficient Funds in Saving to transfer");
                    System.out.println(atm);
                }
            }
        }

        System.out.println("Final Balances");
        System.out.println(atm);

    }
}
