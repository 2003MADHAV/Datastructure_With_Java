/*multi level inheritance*/
package inheritance;
public class Admin extends Developer{
    public void manage()
    {
        System.out.println("manage code");
    }
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.manage();
        admin.write();
        admin.read();
    }
}