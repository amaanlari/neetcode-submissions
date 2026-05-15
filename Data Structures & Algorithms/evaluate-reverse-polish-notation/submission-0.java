class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numStack = new Stack<>();
        Stack<Character> opStack = new Stack<>();

        Set<String> operator = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
        int res = 0;

        for (String s : tokens) {
            if (operator.contains(s)) {
                
                int num2 = numStack.pop();
                int num1 = numStack.pop();

                numStack.push(eval(num1, num2, s.charAt(0)));
            }
            else {
                numStack.push(Integer.parseInt(s));
            }
        }

        return numStack.pop();
    }

    public int eval(int num1, int num2, char operator) {
        switch (operator) {
            case '+': 
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default :
                return 0;
        }
    }
}