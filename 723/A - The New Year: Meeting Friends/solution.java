import java.util.*;
public class cf723A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[3];
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        int x1=arr[0];
        int x2=arr[1];
        int x3=arr[2];
        int ans=0;
        if((x1<x2 && x1>x3) || (x1>x2 && x1<x3)){
            ans+=Math.abs(x1-x2)+Math.abs(x1-x3);
        }
        else if((x2<x1 && x2>x3)|| (x2>x1 && x2<x3)){
            ans+=Math.abs(x2-x1)+Math.abs(x2-x3);
        }
        else{
            ans+=Math.abs(x3-x1)+Math.abs(x3-x2);
        }
        System.out.println(ans);
    }
}