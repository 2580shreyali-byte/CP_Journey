import java.util.*;
public class cf1462A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            int count=0;
            int l=0,r=n-1;
            while(l<=r){
                if(count%2==0){
                    System.out.print(arr[l]+" ");
                    l++;
                }
                else{
                    System.out.print(arr[r]+" ");
                    r--;
                }
                count++;
            }
            System.out.println();
        }
    }
}