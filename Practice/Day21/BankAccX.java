public class BankAccX
{
    private String accNumber ;
    private double accBalance;

    public BankAccX(String aNo, double aBal)
    {
        this.accNumber = aNo;

        if(aBal < 0)
        {
            this.accBalance = 0.0;
        }
        else
        {
            this.accBalance = aBal;
        }
    }

    public String getAccountNumber()
    {
        return this.accNumber;
    }

    public double getBalance()
    {
        return this.accBalance;
    }

    public void deposit(double amount)
    {
        if(amount<=0)
        {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }

        else
        {
            this.accBalance = this.accBalance + amount;
        }
    }

    public boolean withdraw(double amount)
    {
        if(amount<= 0)
        {
            return false;
        }

        if(amount> this.accBalance)
        {
            return false;
        }

      
        this.accBalance = this.accBalance - amount;
        return true;

    }

}
