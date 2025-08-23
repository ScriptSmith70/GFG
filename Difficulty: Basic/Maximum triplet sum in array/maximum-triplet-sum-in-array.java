class Solution {
    // Function to find the maximum triplet sum in the array.
    public int maxTripletSum(List<Integer> arr) {
        // Complete the function
        Collections.sort(arr);
        int n= arr.size();
        int sum=0;
        for(int i=n-1;i>=n-3;i--){
            sum+=arr.get(i);
        }
        return sum;
    }
}