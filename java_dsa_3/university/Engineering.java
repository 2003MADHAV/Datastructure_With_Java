package university;
public class Engineering {
    public double fee;
    private String wifiPass;
    protected String stuData;
    String details;
    private void behavior()
    {
        System.out.println("Intelligents innocents");
    }
    protected void code()
    {
        System.out.println("Pro Coders");
    }
    public void ragging()
    {
        System.out.println("No Ragging");
    }
    void placementCount()
    {
        System.out.println(1000);
    }
    public static void main(String[] args) {
        Engineering engg = new Engineering();
        System.out.println(engg.fee);
        System.out.println(engg.stuData);
        System.out.println(engg.wifiPass);
        System.out.println(engg.details);
        engg.behavior();
        engg.code();
        engg.ragging();
        engg.placementCount();
    }
}
