public class MajorityElement {
    public static void main(String args[]){
        int nums [] = {1,2,2,1,2,1,2};
        int count =0 ;
        int candidate = 0;

        for(int i=0; i<nums.length; i++){
            if(count ==0){
                candidate = nums[i];
            }
            if(nums[i] == candidate){
                count ++;
            } else{
                count--;
            }
        }
    System.out.println(candidate);
    }
    
}
