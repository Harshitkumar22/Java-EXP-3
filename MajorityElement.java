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
