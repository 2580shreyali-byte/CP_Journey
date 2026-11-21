import java.util.*;
public class cf499B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String s1[]=new String[m];
        String s2[]=new String[m];
        for(int i=0;i<m;i++){
            s1[i]=sc.next();
            s2[i]=sc.next();
        }
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        String ans[]=new String[n];
        for(int i=0;i<n;i++){
            String temp=s[i];
            for(int j=0;j<m;j++){
                if(s1[j].equals(temp)){
                    if(s1[j].length()<=s2[j].length()){
                        ans[i]=s1[j];
                        break;
                    }
                    else if(s1[j].length()>s2[j].length()){
                        ans[i]=s2[j];
                        break;
                    }
                }
                else{
                    if(s2[j].equals(temp)){
                        if(s2[j].length()<=s1[j].length()){
                            ans[i]=s2[j];
                            break;
                        }
                        else{
                            ans[i]=s1[j];
                            break;
                        }
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]);
            if(i<=n-2){
                System.out.print(" ");
            }
        }
    }
}