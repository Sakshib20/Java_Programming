
public interface PaymentMethod 
{
    void processPayment(double amount);
}

public class CreditCard implements PaymentMethod
{
    @Override
    public void processPayment(double amount)
    {
        System.out.println("Processing Rs."+ amount + " via Credit Card.");
    }
}

public class UPI implements PaymentMethod
{
    @Override
    public void processPayment(double amount)
    {
        System.out.println("Processing Rs."+ amount + "via UPI ");
    }
}
