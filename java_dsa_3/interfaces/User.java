package interfaces;
public class User {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.copy();
        apple.paste();
        apple.keyboard();
        apple.capturing();
        apple.security();
        Laptop.commonCode();

        Dell dell = new Dell();
        dell.keyboard();
        dell.complements();
        dell.security();;
        
        HP hp = new HP();
        hp.paste();
    }
}