
public class ValidAnagram {
    public static boolean validAnagram(String s, String t){

        if(s.length() != t.length()){ // s=7 , t=7
            return false;
        }
        int nums[] = new int[26];

        for(int i =0; i<s.length(); i++){ // s = 0 to 6
            nums[s.charAt(i) -'a']++; //nums['a' - 'a'] → nums[0]++ same for all
            //a = 1 hogya
        }
        for(int i=0; i<t.length(); i++){
            nums[t.charAt(i) - 'a']--; // same iteration
            if(nums[t.charAt(i)-'a']<0){ //negative hua toh return false
            return false;
        }
    }
    return true;
}
public static void main(String args[]){
    System.out.println(validAnagram("anagram","nagaram"));
    System.out.println(validAnagram("car", "rat"));
}
}
