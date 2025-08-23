class Solution {
    public int isPrime(int N) {
        if (N <= 1) {
            return 0;
        }
        if (N == 2 || N == 3) {
            return 1;
        }
        for (int i = 2; i <= N / 2; i++) {
            if (N % i == 0) {
                return 0; 
            }
        }
        return 1; 
    }
}
