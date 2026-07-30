class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Store all numbers in the set
        for (int num : nums) {
            set.add(num);
        }

        List<Integer> result = new ArrayList<>();

        // Check which numbers are missing
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}