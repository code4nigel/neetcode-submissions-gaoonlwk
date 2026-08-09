
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] copy = Arrays.copyOf(nums,nums.length*2);

        for(int i = 0; i <nums.length;i++){
            copy[nums.length+i] = nums[i];
        }

        return copy;
    }
}