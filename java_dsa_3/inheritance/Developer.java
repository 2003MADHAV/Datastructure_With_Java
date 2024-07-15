/*this code is for example of hierchical inheritance*/
package inheritance;
public class Developer extends User{
    public void write(){
        System.out.println("write code");
        super.read();
    }
    @Override
    public void read()
    {
        System.out.println("developer read code");
    }
    public static void main(String[] args) {
        Developer dev = new Developer();
        System.out.println("Salary: "+dev.salary);
        dev.write();
        dev.read();
    }
}
class Devevloper2 extends User{
    public void edit()
    {
        System.out.println("edit code");
    }
}