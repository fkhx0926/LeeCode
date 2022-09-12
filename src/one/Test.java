package one;


import java.util.Arrays;


/*两数之和
*
*
*
*
* */
public class Test {


  static   class Solution {
        public int[] twoSum(int[] nums, int target) {
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        return new int[]{i,j};
                    }
                }
            }
            return new int[]{};
        }
    }

    public static void main(String[] args) {
        int nums[]=new int[]{1,6,8,7,9,2};
        Solution solution=new Solution();
        solution.twoSum(nums,9);
        System.out.println(Arrays.toString(solution.twoSum(nums,9)));


  }
}
