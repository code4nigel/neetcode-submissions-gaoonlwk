class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s1 = new Stack<>();
        int sum = 0;
        for (String s : operations){
            switch(s){
                case "+":
                int pop = s1.pop();
                int newScore = pop + s1.peek();
                s1.push(pop);
                s1.push(newScore);
                break;

                case "D":
                s1.push(s1.peek() * 2);
                break;

                case "C":
                s1.pop();
                break;

                default :
                s1.push(Integer.parseInt(s));
            }
        }
    while (!s1.isEmpty()){
        sum += s1.pop();
    } return sum;
} 
}