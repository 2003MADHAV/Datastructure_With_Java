package strings;
public class MutableStringExamples {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Uday Kumar");
        System.out.println(name);
        System.out.println(name.append(" Innocent"));
        System.out.println(name.append(123.35));
        System.out.println(name.delete(2,5));
        System.out.println(name.deleteCharAt(4));
        System.out.println(name.replace(6, 10, "ABC"));
        System.out.println(name.insert(5, "XYZ"));
        System.out.println(name.reverse());
    }
}