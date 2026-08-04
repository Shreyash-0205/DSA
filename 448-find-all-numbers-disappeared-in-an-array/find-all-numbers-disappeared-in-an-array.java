class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet <Integer> map = new HashSet<>();

        for(int x : nums){
            map.add(x);
        } 

        ArrayList <Integer> list = new ArrayList<>();

        for(int i = 1;i<=nums.length;i++){
            if(!map.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}