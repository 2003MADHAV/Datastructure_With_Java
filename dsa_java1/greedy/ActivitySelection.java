package greedy;
import java.util.Arrays;
import java.util.Comparator;
class Activity{
    int start;
    int finish;
    public Activity(int s, int f){
        this.start=s;
        this.finish=f;
    }
}
class Compare{
    static void compare(Activity[] acts, int n){
        Arrays.sort(acts, new Comparator<Activity>(){
          @Override
          public int compare(Activity a1, Activity a2){return a1.finish - a2.finish;}
        });
    }
}
public class ActivitySelection {    
    void getMaxActivities(Activity[] acts,int n){        
        Compare obj = new Compare();
        obj.compare(acts,n);
        int i = 0;
        System.out.println(acts[i].start+","+acts[i].finish);
        for(int j=1;j<acts.length;j++){
            if(acts[j].start>=acts[i].finish){
                System.out.println(acts[j].start+","+acts[j].finish);
                i=j;
            }
        }
    }
    public static void main(String[] args) {
        ActivitySelection as = new ActivitySelection();
        Activity[] acts = new Activity[11];
        acts[0] = new Activity(1,4);
        acts[1] = new Activity(3,5);
        acts[2] = new Activity(0,6);
        acts[3] = new Activity(5,7);
        acts[4] = new Activity(3,8);
        acts[5] = new Activity(5,9);
        acts[6] = new Activity(6,10);
        acts[7] = new Activity(8,11);
        acts[8] = new Activity(8,12);
        acts[9] = new Activity(2,13);
        acts[10] = new Activity(12,15);        
        as.getMaxActivities(acts,acts.length);
    }
}