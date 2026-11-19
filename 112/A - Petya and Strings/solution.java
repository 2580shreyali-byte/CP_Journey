import java.util.*;
public class cf112A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int n=s1.length();
        for(int i=0;i<n;i++){
            char c1=Character.toLowerCase(s1.charAt(i));
            char c2=Character.toLowerCase(s2.charAt(i));
            if(c1>c2){
                System.out.println(1);
                return;
            }
            else if(c1<c2){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(0);
    }
}