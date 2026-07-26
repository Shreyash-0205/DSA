class Solution {
    public int[] buildArray(int[] nums) {
        int [] ans = nums.clone();
        for(int i = 0; i<nums.length ; i++){
            nums[i] = ans[ans[i]];
        }
        return nums;
    }
}