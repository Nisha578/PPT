
/*

💡 **Question 8**

Given two strings s and goal, return true *if you can swap two letters in* s *so the result is equal to* goal*, otherwise, return* false*.*

Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].

- For example, swapping at indices 0 and 2 in "abcd" results in "cbad".

**Example 1:**

**Input:** s = "ab", goal = "ba"

**Output:** true

**Explanation:** You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.

 */

import java.util.HashSet;
import java.util.Set;

public class Ques_8 {

    public static boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length())  {
            return false;
        }

        int n = s.length();
        if(s.equals(goal)) {
            Set<Character> temp = new HashSet<>();
            for(char c : s.toCharArray()) {
                temp.add(c);
            }
            return temp.size() < goal.length();
        }

        int i = 0;
        int j = n-1;

        while(i<j && s.charAt(i) == goal.charAt(i)) {
            i++;
        }

        while(j>=0 && s.charAt(j) == goal.charAt(j)) {
            j--;
        }

        if(i<j) {
            char[] arr = s.toCharArray();
            char temp = arr[i];
            arr[i]  = arr[j];
            arr[j] = temp;
            s = new String(arr);
        }

        return s.equals(goal);


    }

    public static void main(String[] args) {
        String s = "ab", goal = "ba";
        boolean a = buddyStrings(s,goal);
        System.out.print(a);
    }
}
