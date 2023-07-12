
/*
<aside>
💡 **Question 1**

A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

- s[i] == 'I' if perm[i] < perm[i + 1], and
- s[i] == 'D' if perm[i] > perm[i + 1].

Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return **any of them**.

**Example 1:**

**Input:** s = "IDID"

**Output:**

[0,4,1,3,2]

</aside>
 */

public class Que_1 {

        public static int[] diStringMatch(String s) {
            int[] ans = new int[s.length() + 1];
            int high = s.length();
            int low = 0;
            int k = 0;
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i) == 'D') {
                    ans[k++] = high--;
                }
                else
                    ans[k++] = low++;
            }
            ans[k++] = high;
            return ans;

        }

    public static void main(String[] args) {
        String s = "IDID";
        int[] a = diStringMatch(s);
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
