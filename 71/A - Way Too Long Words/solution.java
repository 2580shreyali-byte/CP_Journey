import java.util.*;
public class cf71A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            String s=sc.nextLine();
            int len=s.length();
            if(len<=10){
                System.out.println(s);
            }
            else{
                char c1=s.charAt(0);
                char c2=s.charAt(len-1);
                System.out.println(""+c1+(len-2)+c2);
            }
        }
    }
}