
/*

💡 **Question 3**

Given two strings word1 and word2, return *the minimum number of **steps** required to make* word1 *and* word2 *the same*.

In one **step**, you can delete exactly one character in either string.

**Example 1:**

**Input:** word1 = "sea", word2 = "eat"

**Output:** 2

**Explanation:** You need one step to make "sea" to "ea" and another step to make "eat" to "ea".

 */

public class Ques_3 {
    public static int minDistance(String word1, String word2) {
        return minDistance(word1,word2,0,0);
    }
    public static int minDistance(String word1,String word2,int i,int j){
        if(i == word1.length() && j == word2.length()) return 0;
        if(i == word1.length()) return word2.length() - j;
        if(j == word2.length()) return word1.length() - i;
        if(word1.charAt(i) == word2.charAt(j)) return minDistance(word1,word2,i+1,j+1);
        return 1 + Math.min(minDistance(word1,word2,i+1,j), minDistance(word1,word2,i,j+1));
    }

    public static void main(String[] args) {
        String word1 = "sea", word2 = "eat";
        int a = minDistance(word1,word2);
        System.out.print(a);
    }
}
