import java.util.*;
public class cf1791C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int n=sc.nextInt();
            String s=sc.next();
            int ans=0;
            int left=0,right=n-1;
            while(left<=right){
                if((s.charAt(left)=='0' && s.charAt(right)=='1') ||(s.charAt(left)=='1' && s.charAt(right)=='0')){
                    left++;
                    right--;
                }
                else{
                    break;
                }
            }
            ans=right-left+1;
            System.out.println(ans);
        }
    }
}