
/*

💡 **Question 7**

Given two strings s and t, return true *if they are equal when both are typed into empty text editors*. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

**Example 1:**

**Input:** s = "ab#c", t = "ad#c"

**Output:** true

**Explanation:**

Both s and t become "ac".

 */

public class Ques7 {

    public static boolean backspaceCompare(String s, String t) {
        String s1 = backspacecompareoperation(s);
        String t1 = backspacecompareoperation(t);

        return s1.equals(t1);
    }
    public static String backspacecompareoperation(String str){

        int count = 0;
        String ans ="";
        for(int i = str.length()-1; i>=0; i--){
            if(str.charAt(i) == '#'){
                count++;
            }
            else if(count!=0){
                count--;
            }
            else{
                ans = ans + str.charAt(i);
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
        boolean a = backspaceCompare(s,t);
        System.out.print(a);
    }
}
