class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        int i = 0;
        while(i < temperatures.length) {
            int[] temp = new int[]{temperatures[i], i};
            while (stack.isEmpty() == false  && temp[0] > stack.peek()[0]) {
                res[stack.peek()[1]] = temp[1] - stack.pop()[1];
            }
            stack.push(temp);
            i++;
        }
        return res;
    }
}
