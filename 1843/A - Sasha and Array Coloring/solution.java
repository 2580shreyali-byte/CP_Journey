import java.util.*;
public class cf1843A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            int cost=0;
            Arrays.sort(arr);
            int left=0,right=n-1;
            while(left<=right){
                cost+=arr[right]-arr[left];
                left++;
                right--;
            }
            System.out.println(cost);
        }
    }
}