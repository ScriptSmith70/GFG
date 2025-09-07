class Solution {
    public static String reverseString(String s) {
         int n= s.length();
        String k="";
        for(int i=n-1;i>=0;i--){ 
            k=k+s.charAt(i);
        }
        return k;  
    }
}
