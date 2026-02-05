public class ProductOfArray {
    //Pefix & Suffix problem
    public static void productOf(int nums[], int output[]){
        int n = nums.length;//4

        //prefix
        int prefix[] = new int[n];//size h 4
        prefix[0] = 1;
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        //suffix
        int suffix[] = new int[n];
        suffix[n-1] = 1;
        for(int i=n-2; i>=0; i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        //output
        for(int i=0; i<n; i++){
            output[i] = prefix[i] * suffix[i];
        }
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4};
        int output[] = new int[nums.length];

        productOf(nums, output);

        for(int i=0; i<output.length; i++){
            System.out.print(output[i] + " ");
        }
    }
}
//Time Complexity: O(n)
//Space Complexity: O(n)