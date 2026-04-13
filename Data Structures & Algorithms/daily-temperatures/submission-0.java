class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> s1 = new Stack<>();
        int[] results = new int[n];
        for (int i = 0; i < n; i++ ){
             while(!s1.isEmpty() && temperatures[s1.peek()] < temperatures[i]) {
                int p = s1.pop();
                results[p] = i - p;
             }
              s1.push(i);
        } return results;
    }
}
