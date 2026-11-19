import java.util.*;
public class Array{
       public static void main(String[]args){
              Scanner sc=new Scanner(System.in);
              int n=sc.nextInt();
              String[]arr=new String[n];
              for(int i=0;i<n;i++){
                     arr[i]=sc.next();
              }
              int ans=0;
              for(int i=0;i<n;i++){
                     if(arr[i].contains("++")){
                            ans++;
                     }
                     else{
                            ans--;
                     }
              }
              System.out.print(ans);
       }
}