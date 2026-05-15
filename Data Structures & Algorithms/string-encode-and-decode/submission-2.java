class Solution {

    public String encode(List<String> strs) {
        String res = "";

        for (String str : strs) {
            str = str.length() + "#" + str;
            res = res + str;
        }

        return res;
    }

    public List<String> decode(String str) {
        int i = 0; 
        List<String> strs = new ArrayList<>();
        String s = "";

        while (i < str.length()) {
            int j = i;
            String len = "";
            while(str.charAt(j) != '#') {
                len += str.charAt(j);
                j++;
                i++;
            }

            int wordSize = Integer.parseInt(len);
            s = str.substring(j+1, j + 1 + wordSize);
            strs.add(s);

            s = "";
            i = j + 1 + wordSize;
        }

        return strs;
    }
}
