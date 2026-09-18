class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            if (freqMap.putIfAbsent(num, 0) != null) {
                return true;
            }
        }

        return false;
    }
}