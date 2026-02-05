public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int maxProd = nums[0];//6
        int minProd = nums[0]; //6
        int result = nums[0];  //6

        for(int i=1; i<nums.length; i++){
            if(nums[i] < 0){
                //swap
                int temp = maxProd; //temp =6
                maxProd = minProd; //maxProd =6
                minProd = temp;     //minProd =6
            }

            maxProd = Math.max(nums[i], maxProd * nums[i]);          
           // maxProd = Math.max(3, 6* 3)=18;          
            minProd = Math.min(nums[i], minProd * nums[i]);
           //minProd = Math.min(3, 6* 3)=3;
            result = Math.max(result, maxProd);
            //result = Math.max(6, 18)=18;
        }
        return result; //18
    }
    public static void main(String args[]){
        int nums[] = {6,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}
//output: 18