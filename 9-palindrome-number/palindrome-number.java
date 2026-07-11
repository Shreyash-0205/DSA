class Solution {
    public boolean isPalindrome(int x) {
        boolean result = false;
        int rem = 0;
        int val = x;
        while (val>0){
            rem = val%10+rem*10;
            val = val/10;
        }
        if(x==rem){
            result = true;
        }
        return result;
    }
}