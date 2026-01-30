public class EquilibriumIndex {
    //leetcode 724
  public static  int FindEqubIndex(int[]nums){
    int rightSum = 0;
    
    for(int i=0; i<nums.length; i++){
        rightSum = rightSum + nums[i]; // total sum i,e 28
    }
    int leftSum =0;
    for(int i=0; i<nums.length; i++){
        rightSum = rightSum - nums[i];

        if(leftSum == rightSum){
            return i;
        }
        leftSum = leftSum + nums[i];
    }
    return -1;
  }
  public static void main(String args[]){
    int nums[] ={1,3,7,4,6,5};
    System.out.println("Indice of is the equilibrium index is : " + FindEqubIndex(nums));
  }
}
