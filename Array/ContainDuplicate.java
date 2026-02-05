import java.util.HashSet;
public class ContainDuplicate {
    public static boolean Duplicates(int nums[]){

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){  //[1] false
                return true;
            }
            set.add(nums[i]); //[1,...]
        }
        return false;
}
public static void main(String args[]){
    int nums [] = {1,2,3,4,1};
    System.out.println(Duplicates(nums));
}
}