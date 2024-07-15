package greedy;
import java.util.*;
public class JobSequencing {
    static class Job{
        char id;
        int profit;
        int deadline;
        public Job(char id, int prof, int deadline){
            this.id = id;
            this.profit = prof;
            this.deadline = deadline;
        }
    }
    static int maxDeadline(ArrayList<Job> jobs){
        int max = Integer.MIN_VALUE;
        for (Job job : jobs){
            if(job.deadline>max)
                max = (int)job.deadline;
        }
        return max;
    }
    static void maxProfitJobs(ArrayList<Job> jobs){
        Collections.sort(jobs,(a,b)-> {return a.profit - b.profit;});
        ArrayList<Job> res = new ArrayList<>();
        PriorityQueue<Job> maxHeap = new PriorityQueue<>((a,b) -> {return b.profit - a.profit;});
        int n= jobs.size();
        for (int i = n-1; i >= 0 ; i--){
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
        int maxProfit = 0;
        for (int i=0; i < maxDeadline(jobs); i++) {
            System.out.print(res.get(i).id+" ");
            maxProfit += res.get(i).profit;
        }
        System.out.println("\nMax Profit: "+ maxProfit);
    }
    public static void main(String[] args) {
        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(new Job('d',20,2));
        jobs.add(new Job('f',12,1));
        jobs.add(new Job('b',30,4));
        jobs.add(new Job('e',15,3));
        jobs.add(new Job('g',5,2));
        jobs.add(new Job('a',35,3));
        jobs.add(new Job('c',25,4));        
        maxProfitJobs(jobs);
    }
}