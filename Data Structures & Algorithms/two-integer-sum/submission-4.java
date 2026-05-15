class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length <= 1) return new int[]{-1, -1};

        Map<Integer, Integer> diffMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            diffMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            Integer diff = target - nums[i];

            if (diffMap.containsKey(diff) && diffMap.get(diff) != i)
                return new int[]{i, diffMap.get(diff)};
        }

        return new int[]{-1, -1};
    }
}
