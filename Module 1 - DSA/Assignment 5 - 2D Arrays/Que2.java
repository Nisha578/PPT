
/*
<aside>
💡 **Question 5**
You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase **may be** incomplete.

Given the integer n, return *the number of **complete rows** of the staircase you will build*.

**Example 1:**

**Input:** n = 5

**Output:** 2

**Explanation:** Because the 3rd row is incomplete, we return 2.

</aside>
 */

public class Que2 {
    public static int arrangeCoins(int n) {
        long low = 0;
        long high = n;
        while(low <= high) {
            long mid = low + (high-low)/2;
            if(n >= (mid * (mid +1)/2))
                low = mid+1;
            else
                high = mid-1;
        }
        return (int) low-1;
    }
    public static void main(String[] args) {
        int n = 5;
        int a = arrangeCoins(n);
        System.out.println(a);
    }
}
