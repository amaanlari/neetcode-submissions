class Solution {
    public int longestConsecutive(int[] nums) {
         Set<Integer> numSet = new HashSet<>();
         numSet.addAll(Arrays.stream(nums).boxed().collect(Collectors.toList()));
         
         int longest = 0;

         for (int n : nums) {
            // check if its the start of a squence
            if (!numSet.contains(n - 1)) {
                int length = 0;
                while (numSet.contains(n + length)) {
                    length++;
                }
                longest = Math.max(length, longest);
            }
         }
         return longest;
    }
}
