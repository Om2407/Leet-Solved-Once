public class MajorityElement{
    //boyer-Moore
    public static void main(String args[]){
        int nums [] ={1,2,2,1,1,2,2};
        int count =0;
         int candidate = 0;
         for(int i= 0; i<nums.length; i++){
            if(count ==0){
                candidate = nums[i];
            }
            if(nums[i] == candidate){
                count ++;
            }else{
                count--;
            }
         }
         System.out.println("MajorityElement : " + candidate );

    }
}

//logic

//Index	Value	Candidate Count	Action
// 0	 1        1        1    new candidate
// 1	 2	      1 	   0	Cancel
// 2	 2	      2	       1	New candidate
// 3	 1	      2	       0	Cancel
// 4	 2	      2	       1	New candidate
// 5	 2	      2	       2	Support
// 6	 1	      2	       1	Cancel


// public class MajorityElement{
//     public static void main(String args[]){
//         int nums[] = {1,2,2,1,2,2,1};
//         int count =0;
//         for(int i=0; i<nums.length; i++){
//             if(nums[i] == nums[i+i]){
//                 count++;
//             }
//             System.out.println(count);
//         }
//         }
//     }