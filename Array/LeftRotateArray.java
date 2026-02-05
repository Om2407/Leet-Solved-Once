public class LeftRotateArray {
    public static void LeftRotate(int nums[], int k){

        int n = nums.length;
        k = k % n;

        reverse(nums,0 ,k-1); //[3, 2, 1, 4, 5, 6, 7]
        reverse(nums,k,n-1); //[3,2,1,7,6,5,4]
        reverse(nums,0,n-1); //[4,5,6,7,1,2,3]
    }
    static void reverse(int nums[] ,int start,int end){
        while(start<end){
            int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
        }

    }

    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;

        LeftRotate(nums, k);
        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
