
/*

💡 **Question 6**

Given two strings s and goal, return true *if and only if* s *can become* goal *after some number of **shifts** on* s.

A **shift** on s consists of moving the leftmost character of s to the rightmost position.

- For example, if s = "abcde", then it will be "bcdea" after one shift.

**Example 1:**

**Input:** s = "abcde", goal = "cdeab"

**Output:**

true

 */

public class Ques6 {

    public static boolean rotateString(String s, String goal) {
        if(s.equals(goal) == true) return true;
        if(s.length() != goal.length()) return false;

        for(int i = 0; i<s.length(); i++){
            s = s.substring(1) + s.substring(0,1);
            if(s.equals(goal) == true)
                return true;
        }

        return false;

    }

    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        boolean a = rotateString(s,goal);
        System.out.print(a);
    }
}
