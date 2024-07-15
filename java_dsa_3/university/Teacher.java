package university;
public class Teacher {
    private String attendance;
    void setAttendance(String att)
    {
        this.attendance = att;
        System.out.println("Attendace marked as"+this.attendance);
    }
    String getAttendance()
    {
        return this.attendance;
    }
}
