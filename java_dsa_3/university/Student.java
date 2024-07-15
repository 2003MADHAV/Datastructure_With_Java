package university;
public class Student {
    public static void main(String[] args) {
        Teacher trainer = new Teacher();
        trainer.setAttendance("present");
        System.out.println(trainer.getAttendance());
        trainer.setAttendance("absent");
        System.out.println(trainer.getAttendance());
    }
}