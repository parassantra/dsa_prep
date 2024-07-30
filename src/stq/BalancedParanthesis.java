package stq;

import java.util.Stack;

public class BalancedParanthesis {

        public boolean isValid(String s) {
            String openingParanthesis = "{[(";
            int len = s.length();
            Stack<Character> st = new Stack<>();

            for(int i=0; i<len; i++){
                Character curr = s.charAt(i);
                if(openingParanthesis.contains(String.valueOf(curr))){
                    st.push(curr);
                }
                else{
                    if(st.isEmpty()) return false;
                    Character stTop = st.peek();
                    Boolean check1 = curr.toString().equals(")") && stTop.toString().equals("(");
                    Boolean check2 = curr.toString().equals("]") && stTop.toString().equals("[");
                    Boolean check3 = curr.toString().equals("}") && stTop.toString().equals("{");

                    if(!check1 && !check2 && !check3)
                    {
                        return false;
                    }
                    else {
                        st.pop();
                    }
                }
            }
            return st.isEmpty();
        }

    public static void main(String[] args) {
        BalancedParanthesis bp = new BalancedParanthesis();
        System.out.println(bp.isValid("()[]{}"));
    }

}
