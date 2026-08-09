class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];

        int k = 0;
        while(k < first.length() && k < last.length() && first.charAt(k) == last.charAt(k)){ k++;
        }

        return first.substring(0,k);
    }
}