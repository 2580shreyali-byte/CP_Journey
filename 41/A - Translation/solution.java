import java.util.*;
public class cf41A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        StringBuilder sb=new StringBuilder();
        for(int i=s1.length()-1;i>=0;i--){
            char ch=s1.charAt(i);
            sb.append(ch);
        }
        if(sb.toString().equals(s2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}