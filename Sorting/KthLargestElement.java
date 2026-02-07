import java.util.PriorityQueue;
public class KthLargestElement {
 public static int LargestElement(int [] nums, int k){

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    for(int i=0; i<nums.length; i++){
        minHeap.add(nums[i]);

        if(minHeap.size() > k){
            minHeap.poll();
        }
    }
    return minHeap.peek();
 }   
 public static void main(String args[]){

    int [] nums = {3,1,6,4,2,5};
    int k =2;
    System.out.println(LargestElement(nums, k));
 }
}
           //tc O(nlogk)                  