class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid = 0;
        while (start <= end) {
            System.out.println("start: " + start);
            System.out.println("end: " + end);
            mid = start + (end - start) / 2;
            System.out.println(mid);
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
