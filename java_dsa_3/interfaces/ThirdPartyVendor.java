package interfaces;

public abstract class ThirdPartyVendor implements Laptop{
    @Override
    public void security()
    {
        System.out.println("security code");
    }
}