package Stack;

import java.util.Stack;
public class BalancedParantheses {
    static boolean isBalanced(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(') {
                st.push(ch);

            } else {
                if (st.isEmpty()) return false;
                if (ch == '}' && st.pop() != '{')  return false;
                else if (ch == ']' && st.pop() != '[') return false;
                else if (ch == ')' && st.pop() != '(') return false;
            }
        }
        return (st.isEmpty());
    }
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (char it : s.toCharArray()) {
            if (it == '(' || it == '[' || it == '{')
                st.push(it);
            else {
                if(st.isEmpty()) return false;
                char ch = st.pop();
                if((it == ')' && ch == '(') ||  (it == ']' && ch == '[')
                        || (it == '}' && ch == '{')) {
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String br1="()[{}()]";
        String br2="()[{})]";
        if (isBalanced(br1)) System.out.println(br1+" is Balanced ");
        else System.out.println(br1+" Not Balanced");

        if (isBalanced(br2)) System.out.println(br2+" is Balanced ");
        else System.out.println(br2+" Not Balanced");
    }
}
