class Solution {
    public int findMin(int a, int b) {
        // Your code here
        int Min = Integer.MAX_VALUE;
        
        int sum = a + b;
        Min = Math.min(Min, sum);
        int sub = a - b;
        Min = Math.min(Min, sub);
        int mul = a * b;
        Min = Math.min(Min, mul);
        try{
            int div = a / b;
            Min = Math.min(Min, div);
        }
        catch(ArithmeticException e){
        }
        return Min;
    }
}