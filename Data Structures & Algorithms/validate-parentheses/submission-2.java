class Solution {
    public boolean isValid(String s) {
        Stack<Character> openStack = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put('}', '{');
        closeToOpen.put(']', '[');

        for (char ch : s.toCharArray()) {
            if (closeToOpen.containsKey(ch)) {
                if (!openStack.isEmpty() && openStack.peek() == closeToOpen.get(ch))
                    openStack.pop();
                else
                    return false;
            } else {
                openStack.push(ch);
            }
        }
        return openStack.isEmpty();
    }
}
