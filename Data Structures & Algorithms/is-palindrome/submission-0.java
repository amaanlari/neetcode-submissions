class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int len = s.length();
        String rev = "", str = "";
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                rev = ch + rev;
                str = str + ch;
            }
        }

        return str.equalsIgnoreCase(rev);
    }
}
