import java.util.*;
public class cf131A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i>=1 && Character.isLowerCase(ch)){
                flag=false;
                System.out.println(s);
                return;
            }
        }
        StringBuilder sb=new StringBuilder();
            char ch=s.charAt(0);
            if(Character.isLowerCase(s.charAt(0))){
                sb.append(Character.toUpperCase(ch));
            }
            else{
                sb.append(Character.toLowerCase(ch));
            }
            for(int i=1;i<s.length();i++){
                ch=s.charAt(i);
                sb.append(Character.toLowerCase(ch));
            }
        System.out.println(sb);
    }
}