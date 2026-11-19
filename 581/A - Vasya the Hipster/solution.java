import java.util.*;
public class cf581A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print(Math.min(a,b)+" ");
        int l=Math.max(a,b)-Math.min(a,b);
        int ans=l/2;
        System.out.print(ans);
    }
}
 