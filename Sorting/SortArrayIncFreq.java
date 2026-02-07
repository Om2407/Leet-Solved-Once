import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class SortArrayIncFreq {

    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        
        // Step 1: Frequency count
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Convert int[] to Integer[] (boxing required)
        Integer[] temp = new Integer[n];
        for(int i = 0; i < n; i++) {
            temp[i] = nums[i];
        }
        
        // Step 3: Custom sort
        Arrays.sort(temp, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                int freqA = freq.get(a);
                int freqB = freq.get(b);
                
                // Sort by frequency (ascending)
                if(freqA != freqB) {
                    return freqA - freqB;
                }
                // If frequency same, sort by value (descending)
                return b - a;
            }
        });
        
        // Step 4: Copy back to int[]
        for(int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
        
        return nums;
    }
    public static void main(String args[]){
        SortArrayIncFreq obj = new SortArrayIncFreq();
        int nums[] = {1,1,2,2,2,3};
        int[] sorted = obj.frequencySort(nums);
        System.out.println(Arrays.toString(sorted));
    }
}