public class KadaneAlgo {
    public static void main(String[] args) {
        //Given an integer array,maximum sum of any continous subarray find karo.?
      int nums [] = {-2,-1,-3,4,-1,2,1,-5,4};
           
        int currSum =0;
        int maxSum = nums[0];
        for(int i=0; i<nums.length; i++){

            currSum = Math.max(nums[i], currSum + nums[i]); //5
            maxSum = Math.max(maxSum, currSum);//6
        }
        System.out.println(currSum);
        System.out.println(maxSum);
}
}
//explaination--
// i	arr[i]	currSum	   maxSum
// 0	-2	max(-2,0-2)=-2	-2
// 1	1	max(1,-2+1)=1	 1
// 2	-3	max(-3,1-3)=-2	1
// 3	4	max(4,-2+4)=4	4
// 4	-1	max(-1,4-1)=3	4
// 5	2	max(2,3+2)=5	5
// 6	1	max(1,5+1)=6	6
// 7	-5	max(-5,6-5)=1	6
// 8	4	max(4,1+4)=5	6