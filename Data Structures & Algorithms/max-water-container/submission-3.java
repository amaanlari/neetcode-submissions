class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1;

        int res = 0;

        while (l < r) {
            int area = Math.abs(l - r) * Math.min(heights[l], heights[r]);

            if (area > res) res = area;

            if (heights[l] > heights[r])
                r--;
            else
                l++;
        }

        return res;
    }
}
