public class MaximumRotatedSortArray {
    public static int findMax(int nums[]){

        int left = 0;
        int right = nums.length-1;

        while(left<right){
            int mid = left + (right-left)/2;
            if(nums[mid] > nums[mid+1]){
                return nums[mid];
            }
            if(nums[mid]> nums[left]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return nums[left];
    }
    public static void main(String args[]){
        int nums[] = {11,15,99,0,1,2,3};
        System.out.println(findMax(nums));
    }
}
