import java.util.*;
public class cf577A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long x=sc.nextLong();
        long cnt=0;
        for(long i=1;i<=n;i++){
            if(x%i==0){
                long j=x/i;
                if(j>=1 && j<=n){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}