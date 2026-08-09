class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];

        for(int j = 0; j < first.length(); j++){
            char current = first.charAt(j);

            for(int i = 0; i < strs.length; i++){
                if(j >= strs[i].length() || strs[i].charAt(j) != current)
                return first.substring(0,j);
            }
        }
        return first;
    }
}