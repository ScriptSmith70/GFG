class Solution {
    public static int largest(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        return arr[n-1];
        
    }
}
