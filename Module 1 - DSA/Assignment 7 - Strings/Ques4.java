
/*

💡 **Question 4**

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

**Example 1:**

**Input:** s = "Let's take LeetCode contest"

**Output:** "s'teL ekat edoCteeL tsetnoc"

 */

public class Ques4 {

    public static String reverse(String str)
    {
        String newstr="";
        // System.out.print(str);
        for(int i=str.length()-1;i>=0;i--)
        {
            newstr += str.charAt(i);
        }
        return newstr;
    }

    public static String reverseWords(String s) {
        String ans="";
        String str="";
        for(int i=0;i<=s.length()-1;i++)
        {
            if(s.charAt(i)==' ')
            {
                ans += reverse(str);
                ans += ' ';
                str = "";
            }
            else if(i == s.length()-1)
            {
                str += s.charAt(i);
                ans += reverse(str);
            }
            else
            {
                str += s.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String ans = reverseWords(s);
        System.out.print(ans);
    }

}
