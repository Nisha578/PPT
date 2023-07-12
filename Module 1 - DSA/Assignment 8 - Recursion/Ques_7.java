
/*

💡 **Question 7**

Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will never exceed 105.

**Example 1:**

**Input:** s = "3[a]2[bc]"

**Output:** "aaabcbc"

 */

import java.util.Stack;

public class Ques_7 {
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> wordStack = new Stack<>();

        int number = 0;
        StringBuilder word = new StringBuilder();

        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                number = number * 10 + (c - '0');
            }
            else if(Character.isLetter(c)){
                word.append(c);
            }
            else if(c == '['){
                countStack.add(number);
                wordStack.add(word.toString());
                number = 0;
                word = new StringBuilder();
            }
            else {
                int count = countStack.pop();
                StringBuilder duplicateWord = new StringBuilder(wordStack.pop());
                for(int j = 1; j<=count; j++){
                    duplicateWord.append(word);}
                word = duplicateWord;

            }
        }
        return word.toString();
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        String a = decodeString(s);
        System.out.println(a);
    }
}
