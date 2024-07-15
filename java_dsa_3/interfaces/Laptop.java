package interfaces;
public interface Laptop {
    public abstract void copy();
    public abstract void paste();
    public abstract void keyboard();
    default void security()
    {
        System.out.println("security feature");
    }
    default void capturing()
    {
        commonCode();
        System.out.println("capture code");
    }
    static void commonCode()
    {
        System.out.println("repeated code");
    }
    /*
    //private methods are allowed from JAVA9 onwards
    private void updatedRule()
    {
        System.out.println("updated soft rule ");
    }    
    */
}