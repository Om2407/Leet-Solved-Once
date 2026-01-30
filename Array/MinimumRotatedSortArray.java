public class MinimumRotatedSortArray {
    public static int findMin(int[] nums) {
        //BINARY SEARCH-minimum value dena h toh minimum  h 1
       int left =0; //0
       int right = nums.length -1; //6

       while(left<right){ //0<6
        int mid = left + (right-left)/2; //3
        if(nums[mid]> nums[right]){//7 >2
            left = mid+1; // 4;
        }else{
            right = mid;
        }
       }
       return nums[left];
    }
    public static void main(String args[]){
        int nums[] = {4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }
}
