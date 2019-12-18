
import java.util.*;
/**
 * Employee - Write a description here.
 * 
 * @author (MINHO CHOI)
 * @version (November. 2019)
 */
public class BankSystem
{
    private String name;
    private int chequeAcctNum, savingAcctNum;
    private double chequeBal, savingBal;

    public BankSystem(String n, int chqAcctNum, double chqBal, int savAcctNum, double savBal)
    {
        name =n;
        chequeAcctNum = chqAcctNum;
        chequeBal = chqBal;
        savingAcctNum = savAcctNum;
        savingBal = savBal;
    }    

    public boolean withdrawChequing (double amount)
    {
        boolean check;
        if (amount > chequeBal)
        {   
            check = false;
        }
        else
        {
            check = true;
            chequeBal = chequeBal - amount;
        }
        return check;
    }
    
    public boolean withdrawSaving(double amount)
    {   
        boolean check;
        if (amount > savingBal)
        {   
            check = false;
        }
        else
        {
            check = true;
            savingBal = savingBal - amount;
        }
        return check;
    }

    public void depositChequing(double amount)
    {
        chequeBal = chequeBal + amount;
    }

    public void depositSaving(double amount)
    {
        savingBal = savingBal + amount;
    }
    
    public double getBalanceChequing()
    {
        return chequeBal;
    }
    
    public double getBalanceSaving()
    {
        return savingBal;
    }
    
    public boolean transferToSaving(double amount)
    {   
        boolean check;
        if (amount > chequeBal)
        {   
            check = false;
        }
        else
        {
            check = true;
            savingBal = savingBal + amount;
            chequeBal = chequeBal - amount;
        }
        return check;
    }

      public boolean transferToChequing(double amount)
    {   
        boolean check;
        if (amount > savingBal)
        {   
            check = false;
        }
        else
        {
            check = true;
            savingBal = savingBal - amount;
            chequeBal = chequeBal + amount;
        }
        return check;
    }
    
    public String toString()
    {
        String string = "Name: " + name + "\n" +
                    "Cheque Acct #: "+ chequeAcctNum + "\n"
                    + " Balance = $"+chequeBal + "\n"
                    + "Saving Acct #: "+ savingAcctNum + "\n"
                    + " Balance = $"+savingBal;
        return string;
    }
}
