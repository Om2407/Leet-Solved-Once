public class TwoSum2 {
    public int[] twoSum(int [] nums, int target){

        int left =0; 
        int right = nums.length-1;
    
        while(left<right){
            int sum = nums[left] + nums[right];
            if(sum==target){
                return new int[]{left+1, right+1};
            }else if(sum<target){
                left++;
            }else if(sum>target){
                right--;
            }
        }
        return new int[]{-1,-1};
        }
        public static void main(String args[]){

            TwoSum2 obj = new TwoSum2();
            int [] nums= {2,7,11,15};
            int target = 9;

            int ans[] = obj.twoSum(nums, target);
            System.out.println(ans[0]+ " " + ans[1]);
        }
    }


