class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet <Integer> map = new HashSet<>();

        for(int x : nums){
            map.add(x);
        }

        List <Integer> ans = new ArrayList <>();

        for(int i = 1;i<=nums.length;i++){
            if(!map.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}