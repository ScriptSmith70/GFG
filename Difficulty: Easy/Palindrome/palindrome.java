class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int num=n;
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev=(rev*10)+digit;
            num/=10;
        }
        return n==rev;
    }
}