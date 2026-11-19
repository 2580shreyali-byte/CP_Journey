import java.util.*;
public class cf617A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        while(n-5>=0){
            n=n-5;
            ans++;
        }
        while(n-4>=0){
            n=n-4;
            ans++;
        }
        while(n-3>=0){
            n=n-3;
            ans++;
        }
        while(n-2>=0){
            n=n-2;
            ans++;
        }
            ans+=n;
        System.out.println(ans);
    }
}