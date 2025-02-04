//2) Given an array  of size n, return the majority element.
//The majority element is the element that appears more than 
//[n / 2] times. You may assume that the majority element always exists in the array.
//Example:
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2

public class MajorityElement{       //class named MajorityElement.
    public static int findMajorityElement(int[] nums){    //static method named findMajorityElement.
        int ans=nums[0];
        int count=1;

        for(int i=1; i<nums.length; i++){
            if(nums[i]==ans){
                count++;
            }else{
                count--;
                if (count==0){
                    ans=nums[i];
                    count=1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args){
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + findMajorityElement(nums));
    }
}
