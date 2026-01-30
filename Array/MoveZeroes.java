public class MoveZeroes {
    public static void main(String arhs[]){

        int nums[] = {0,1,0,3,12};
        int j = 0; // non-zero ki position

        for(int i=0; i<nums.length; i++){
            if(nums[i] !=0){ //agar 0 h condition failed or agar 0 nhi h tb 
                int temp = nums[i]; // temp = 1
                nums[i] = nums[j]; // 1 = 0
                nums[j] = temp; // 0 se 1
                j++;
            }
        }
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
