import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet <Integer> nums = new HashSet<>();
        HashSet <Integer> ans = new HashSet<>();

        for(int x : nums1){
            nums.add(x);
        }

        for(int x : nums2){
            if(nums.contains(x)){
                ans.add(x);
            }
        }

        int [] result = new int [ans.size()];

        int i = 0;
        for(int num : ans){
            result[i] = num;
            i++;
        }

        return result;
    }
}