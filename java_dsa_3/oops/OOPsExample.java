package oops;
class Student
{
    int rollNo;
    String name;
    float cgpa;
    Student(int rN, String nam)
    {
        this.rollNo=rN;
        this.name=nam;
    }    
    Student(int rN, String nam,float gpa)
    {
        this.rollNo=rN;
        this.name=nam;
        float cgpa=gpa;
    }
    String greet()
    {
        return "Hello "+name+"!!";
    }
}
public class OOPsExample {
    public static void main(String[] args) {        
        Student abhi = new Student(245,"Abhishek",8.98f);
        System.out.println(abhi.rollNo+" "+abhi.name+" "+abhi.cgpa);
        
        Student vamshi = new Student(187,"Vamshi",9.67f);
        Student rabi = new Student(187,"Ravi",9.67f);
        Student vikky = new Student(187,"vikky",9.67f);
        Student nikky = new Student(187,"Nikky",9.67f);
        Student puppy = new Student(187,"Puppy",9.67f);
        Student usha = new Student(143,"Usha");
    }
}
