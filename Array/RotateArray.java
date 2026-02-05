public class RotateArray {
    public static void rotate(int nums[] ,int k){

        int n = nums.length; //6 [1,2,3,4,5,6,7]
        k = k % n ;
         //step -1 curr -{1.2.3.4.5.6.7}
         reverse(nums,0,n-1); //{7,6,5,4,3,2,1}
         reverse(nums,0,k-1);//{5,6,7,4,3,2,1}
         reverse(nums,k,n-1); //{5,6,7,1,2,3,4}
    }
    static void reverse(int[]nums,int start ,int end){
        while(start < end){ // extra space nale iss liye swap karna padega
            int temp = nums[start];
            nums[start] = nums [end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,6,7};
        int k =3;
        rotate(nums, k);

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
    }
    }
}
