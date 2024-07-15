package university;
public class Management {
    public static void main(String[] args) {
        Engineering engg = new Engineering();
        System.out.println(engg.details);
        //System.out.println(engg.wifiPass);
        System.out.println(engg.fee);
        System.out.println(engg.stuData);
        engg.placementCount();
        engg.ragging();
        engg.code();
        //engg.behavior();
    }
}
