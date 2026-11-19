import java.util.*;
public class cf339A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<3;i++){
            for(int j=0;j<s.length();j++) {
                char ch = s.charAt(j);
                if (i==0 && j%2==0) {
                    if (ch == '1') {
                        sb.append(ch);
                        sb.append("+");
                    }
                }
                else if(i==1 && j%2==0){
                    if(ch=='2'){
                        sb.append(ch);
                        sb.append("+");
                    }
                }
                else if(i==2 && j%2==0){
                    if(ch=='3') {
                        sb.append(ch);
                        sb.append("+");
                    }
                }
            }
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}