class Solution {
    public int search(int arr[], int x) {
        // code here
        int ans = 0;
        for (int i =0; i < arr.length; i++){
            if(arr[i] == x){
                ans = i;
                return ans;
            }
        }
        if(ans==0){
            return -1;
        }
        return ans;
    }
}
