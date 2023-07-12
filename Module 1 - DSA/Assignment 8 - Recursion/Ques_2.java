
/*

💡 **Question 2**

Given a string s containing only three types of characters: '(', ')' and '*', return true *if* s *is **valid***.

The following rules define a **valid** string:

- Any left parenthesis '(' must have a corresponding right parenthesis ')'.
- Any right parenthesis ')' must have a corresponding left parenthesis '('.
- Left parenthesis '(' must go before the corresponding right parenthesis ')'.
- '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".

**Example 1:**

**Input:** s = "()"

**Output:**

true

 */

public class Ques_2 {

        public static boolean checkValidString(String s) {
            int len = s.length();
            Boolean[][] memo = new Boolean[len + 1][len + 1];

            boolean ans = checkValidString(s, 0, 0, memo);

            return ans;
        }

        private static boolean checkValidString(String s, int id, int openCount, Boolean[][] memo) {
            if (id == s.length()) {
                return openCount == 0;
            }

            if (openCount < 0 || openCount > s.length() / 2) {
                return false;
            }

            if (memo[id][openCount] != null) {
                return memo[id][openCount];
            }

            char ch = s.charAt(id);
            if (ch == '(') {
                openCount++;
                return checkValidString(s, id + 1, openCount, memo);
            } else if (ch == ')') {
                openCount--;
                boolean ans = checkValidString(s, id + 1, openCount, memo);
                openCount++;

                return ans;
            } else {
                boolean ans = checkValidString(s, id + 1, openCount, memo);
                if (ans) {
                    return ans;
                }

                openCount++;
                ans = checkValidString(s, id + 1, openCount, memo);
                openCount--;
                if (ans) {
                    return ans;
                }

                openCount--;
                ans = checkValidString(s, id + 1, openCount, memo);
                openCount++;

                memo[id][openCount] = ans;
                return ans;
            }
        }

    public static void main(String[] args) {
         String s = "()";
         boolean a = checkValidString(s);
        System.out.print(a);
    }
}
