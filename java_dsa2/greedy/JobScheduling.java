package greedy;
import java.util.*;
public class JobScheduling {
    static class Job{
        char id;
        int profit;
        int deadline;
        public Job(char id, int profit, int deadline){
            this.id = id;
            this.profit = profit;
            this.deadline = deadline;
        }
    }
    static void maxProfitJobs(ArrayList<Job> jobs){
        Collections.sort(jobs, (a,b) -> {return a.deadline - b.deadline;});
        PriorityQueue<Job> maxHeap = new PriorityQueue<>((a,b) -> {return b.profit - a.profit;});
        ArrayList<Job> res = new ArrayList();
        int n = jobs.size();
        for(int i=n-1;i>=0;i--){
            int slotsRemaining;
            if(i==0)
                slotsRemaining = jobs.get(i).deadline;
            else
                slotsRemaining = jobs.get(i).deadline - jobs.get(i-1).deadline;
            maxHeap.add(jobs.get(i));
            while(slotsRemaining>0 && !maxHeap.isEmpty()){
                Job job = maxHeap.remove();
                slotsRemaining--;
                res.add(job);
            }
        }
        Collections.sort(res,(a,b)-> {return b.deadline - a.deadline;});
        int profit = 0;
        for(Job re : res){
            System.out.print(re.id+" ");
            profit += (int)re.profit;
        }
        System.out.println("\n\nmaxProfit: "+profit);
    }
    public static void main(String[] args) {
        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(new Job('a',50,20));
        jobs.add(new Job('b',20,1));
        jobs.add(new Job('c',35,1));
        jobs.add(new Job('d',25,2));
        jobs.add(new Job('e',40,3));
        jobs.add(new Job('f',15,4));
        maxProfitJobs(jobs);
    }
}