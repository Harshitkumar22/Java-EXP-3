//3) Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Example:
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]


public class MoveZeros{
    public static void moveZeroes(int[] nums){
        int count=0;
        
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[count]=nums[i];
                if(count!=i){
                    nums[i]=0;
                }
                count++;
            }
        }
    }

    public static void main(String[] args){
        int[] nums={0, 1, 0, 3, 12};
        moveZeroes(nums);
        
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
