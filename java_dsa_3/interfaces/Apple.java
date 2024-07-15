package interfaces;
public class Apple implements Laptop{

    @Override
    public void copy() {
        System.out.println("apple copy code");
    }
    @Override
    public void paste() {
        System.out.println("apple paste code");
    }
    @Override
    public void keyboard() {
        System.out.println("apple keyboard code");
    }    
}