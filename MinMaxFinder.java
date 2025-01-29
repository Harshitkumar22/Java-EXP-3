//1) Given an integer array nums of size n, find the maximum and minimum elements in the array and return them as a pair.
// Example:
// Input: nums = [1, 5, 7, 2, 9, 3]
// Output: [9, 1]

public class MinMaxFinder{
    public static void main(String[] args){
        int[] nums={1, 5, 7, 2, 9, 3};

        int max=nums[0];
        int min=nums[0];

        for (int i=1; i<nums.length; i++) {
            if (nums[i]>max) {
                max=nums[i];
            }
            if (nums[i]<min) {
                min=nums[i];
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}