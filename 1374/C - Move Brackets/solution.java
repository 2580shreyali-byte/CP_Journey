import java.util.*;
public class cf1374C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=1;j<=t;j++) {
            int n=sc.nextInt();
            String s = sc.next();
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (!st.isEmpty()) {
                    char ch1 = st.peek();
                    if (ch == ')' && ch1 == '(') {
                        st.pop();
                    } else {
                        st.push(ch);
                    }
                } else {
                    st.push(ch);
                }
            }
            System.out.println(st.size()/2);
        }
    }
}