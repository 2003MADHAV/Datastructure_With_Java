import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner  sc = new  Scanner(System.in);
        int n = sc.nextInt();
        //int j = 0;
        int sum =0;
        int b = n/2;
        for(int i = 1; i<= b;i++){
           
            if(n%i==0){
                sum +=i;        
            }
            
        }if(n==sum){
        System.out.println("perfect number");
        }else{
            System.out.println("not a perfect number");
        }
        
        sc.close();
    }

}
