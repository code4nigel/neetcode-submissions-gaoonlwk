class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();

        for (char c : s.toCharArray()){
            if (c == '(' || c == '{' || c == '['){
                s1.push(c);
            } else{
                if (s1.isEmpty()){
                return false;
                 }
                 char pop = s1.pop();

                if (c == ')' && pop != '(') return false;
                if (c == '}' && pop != '{') return false;
                if (c == ']' && pop != '[') return false;
            }
        }
        return s1.isEmpty();
    }
}
