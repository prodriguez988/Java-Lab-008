import java.util.Arrays;

public class RecursivePractice {

    public static int oddSum(int n){
        int i=0;
        if (n<=0){
            return i;
        }
        if (n%2!=0){
            i=n+oddSum(n-2);
            return i;
        }
        else{
            i=oddSum(n-1);
        }
        return i;
    }


    public static int ack(int m, int n){
       int i=0;
        if (m==0) {
            i=n+1;
            return i;
        }
        if (m>0 && n==0){
            i=ack(m-1,1);
            return i;
        }
        if (m>0 && n>0){
            i=ack(m-1,ack(m, n-1));
            return i;
        }
        return i;
    }


    public static double power(double x, int n){
        double answer =0;
        if (n==0){
            return 1;
        }
        answer=x*power(x,n-1);
        return answer;
    }


    public static int maxInRange(int[] x, int low, int high) {
        if (high == low) {
            return x[low];
        }
        int half=(low+high)/2;

        int maximumLow=maxInRange(x,low,half);

        int maximumHigh=maxInRange(x,half+1,high);

        return Math.max(maximumLow,maximumHigh);
    }


    public static void main(String[] args) {
    }
}