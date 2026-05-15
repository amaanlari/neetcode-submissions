class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if (nums.length > numsSet.size()) {
            return true;
        }
        return false;
    }
}