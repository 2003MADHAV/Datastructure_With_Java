package oops;
public class Student {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        trainer.setAttendance("present");
        System.out.println(trainer.getAttendance());
    }
}