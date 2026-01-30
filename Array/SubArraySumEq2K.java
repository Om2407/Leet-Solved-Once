import java.util.HashMap;
public class SubArraySumEq2K {
    public static void main(String args[]){
      int nums[] = {1,2,3};
      int k = 3;
      HashMap<Integer,Integer> map = new HashMap<>();
      map.put(0,1 ); //ki agar pehel hi subarray ka sum k ke eual ho toh agar{3,4,2,1};

      int prefixSum = 0;
      int count = 0;
      for(int i=0; i<nums.length; i++){
        prefixSum = prefixSum + nums[i];
        if(map.containsKey(prefixSum-k)){
            count +=map.get(prefixSum-k);
        }
        map.put(prefixSum,map.getOrDefault(prefixSum, 0)+1);
      }
      System.out.println(count);
        
    }
    //BRUTE FORCE
    // public static void main(String args[]){
    //     int nums [] ={ 1,2,3};
    //     int count = 0;
    //     int k = 3;

    //     for(int i=0; i<nums.length; i++){
    //         for(int j = i+1; j<nums.length; j++){
    //             int sum = 0;
    //             sum = sum + nums[j];
            
    //        if(sum ==k){
    //         count ++;
    //        }
    //         }
    //     }
    //     System.out.println(count);
    // }
}
