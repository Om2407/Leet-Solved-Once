import java.util.HashMap;
public class TwoSum {
    public static void main(String args[]){

        HashMap<Integer, Integer> map = new HashMap<>();
        int nums[] = {11,2,7,15};
        int target = 9;

        for(int i=0; i<nums.length ; i++){
            int current = nums[i];
            int needed = target - nums[i];

            if(map.containsKey(needed)){
                System.out.println(map.get(needed) + " " + i);
                return;
            }
            map.put(current,i);
        }

        
//         int nums[] = {1,3,6,8,15};
//         int target = 4;

//         for(int i=0; i<nums.length; i++){
//             for(int j=i+1; i<nums.length; j++){

//                 if(nums[i] + nums[j] == target){
//                     System.out.println("Indices " + i + " , " + j);
//                     return;
//                 }
//             }
//         }
// System.out.println("No pair");
    }
}