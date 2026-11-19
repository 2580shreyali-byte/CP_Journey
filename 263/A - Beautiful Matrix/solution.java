import java.util.*;
public class Array{
       public static void main(String[]args){
              Scanner sc=new Scanner(System.in);
              int[][]arr=new int[5][5];
              int r=0,c=0;
              for(int i=0;i<5;i++){
                     for(int j=0;j<5;j++){
                            arr[i][j]=sc.nextInt();
                            if(arr[i][j]==1){
                                   r=i;
                                   c=j;
                            }
                     }
                     System.out.println();
              }
              int ans=0;
              ans=Math.abs(r-2)+Math.abs(c-2);
              System.out.println(ans);
       }
}