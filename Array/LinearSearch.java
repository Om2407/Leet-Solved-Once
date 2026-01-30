public class LinearSearch {
    //search in a sorted array
    public static void main(String args[]){
        int nums[] = {1,3,5,7,9,11};
        int target = 7;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                System.out.println(i);
            }
        }
    }
}
