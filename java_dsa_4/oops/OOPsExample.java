package oops;
class Student
{
        int rollNo;
        String name;
        float cgpa;
        Student(int rollNo, String name, float cgpa)
        {
            this.rollNo = rollNo;
            this.name = name;
            this.cgpa = cgpa;
        }
}
public class OOPsExample {
    public static void main(String[] args) {
        
        Student tarun = new Student(123,"Tarun",9.8f);
        Student karan = new Student(123,"Karan",9.8f);
        Student pavan = new Student(123,"Pawan",9.8f);

        Student[] students = null;
        students[0] = new Student(12,"ab",6.7f);
        System.out.println(students[0].cgpa);
        System.out.println(students[0].name);
        System.out.println(students[0].rollNo);
    }
}