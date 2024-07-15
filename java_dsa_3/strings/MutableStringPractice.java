package strings;
public class MutableStringPractice {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("linga");
        System.out.println(name);
        name.append("123");  
        System.out.println(name);
        
        System.out.println(name.delete(2,4));
        System.out.println(name.deleteCharAt(5));

        StringBuffer name2 = new StringBuffer("linga welcomes you");
        System.out.println(name2.indexOf("l",4));
        System.out.println(name2.replace(1, 5, "eela"));
        //leela not welcomes you
        System.out.println(name2.insert(6, "not "));
        System.out.println(name2.reverse());
        
        
        
    }
}