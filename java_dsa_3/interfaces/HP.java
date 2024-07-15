package interfaces;
public class HP implements Laptop{

    @Override
    public void copy() {
        System.out.println("hp copy code");
    }

    @Override
    public void paste() {
        System.out.println("hp paste code");
    }

    @Override
    public void keyboard() {
        System.out.println("hp keyboard code");
    }    
}
