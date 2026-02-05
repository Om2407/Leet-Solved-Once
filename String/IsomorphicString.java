import java.util.*;
public class IsomorphicString {
    public static boolean isIsomorphic(String str, String ptr){
        HashMap<Character,Character> S1 = new HashMap<>();
        HashMap<Character,Character> S2 = new HashMap<>();

        if(str.length() != ptr.length())
            return false;

        for(int i=0; i<str.length(); i++){
            char c1 = str.charAt(i);
            char c2 = ptr.charAt(i);

            if(S1.containsKey(c1)){
                if(S1.get(c1) != c2)
                    return false;
            }else{
                S1.put(c1, c2);
            }
            if(S2.containsKey(c2)) {
                if(S2.get(c2) != c1)
                return false;
            }else{
                S2.put(c2, c1);
            }
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
    }
}
