package interfaces;
public class Dell extends ThirdPartyVendor{
    @Override
    public void copy() {
        System.out.println("dell copy code");
    }
    @Override
    public void paste() {
        System.out.println("dell paste code");
    }
    @Override
    public void keyboard() {
        System.out.println("dell keyboard code");
    }    
    public void complements()
    {
        System.out.println("dell compliments");
    }
}