import java.util.*;
public class cf381 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int s=0,d=0,count=0;
        int left=0;
        int right=n-1;
        while(left<=right){
            if(arr[left]<arr[right]){
                if(count%2==0){
                    s+=arr[right];
                }
                else{
                    d+=arr[right];
                }
                right--;
            }
            else{
                if(count%2==0){
                    s+=arr[left];
                }
                else{
                    d+=arr[left];
                }
                left++;
            }
            count++;
        }
        System.out.println(s+" "+d);
    }
}