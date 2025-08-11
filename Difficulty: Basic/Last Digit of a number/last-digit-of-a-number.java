class Solution {
    public int lastDigit(int n) {
        // Code here
        int ans = Math.abs(n%10);
        return ans;
    }
}