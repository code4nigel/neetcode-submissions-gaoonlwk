class Solution {
    public int mySqrt(int x) {
        int left =  1;
        int right = x;

        while (left <= right){
            int mid = left + (right - left)/2;
            long middle = (long) mid*mid;

            if (middle < x){
                left = mid + 1;
            } else if (middle > x){
                right = mid - 1;
            } else return mid;
        } return right;

    }
}