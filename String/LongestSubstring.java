import java.util.HashSet;
public class LongestSubstring {
    // Longest SubString Without Repeating Characters--leecode3
    public static int LongsubStringwithoutRepeatChar(String str){

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int right = 0; 
        int maxlength = 0;

    while(right< str.length()){
        //(0<8) condition--true
        char ch = str.charAt(right);
        if(!set.contains(ch)){
            set.add(ch);
            maxlength = Math.max(maxlength, right-left+1);
            //yeh output dega = 3
            right++;//
        }else{
            set.remove(str.charAt(left));
            left++;//jb bhi koi duplicate milega tb left++ hoga
            //left =5 hoga kyuki 7 duplicates h
        }
    }
    return maxlength;
    }
    public static void main(String args[]){
        System.out.println(LongsubStringwithoutRepeatChar("abcabcbb"));
        System.out.println(LongsubStringwithoutRepeatChar("bbbbb"));
    }
}