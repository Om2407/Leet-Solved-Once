public class ImplementSTR {
    public static int strstr(String heystack, String needle){

        if(needle.length() ==0)
            return 0;

        int heystackLength = heystack.length();
        int needleLength = needle.length();

        for(int i=0; i<= heystackLength - needleLength; i++){
            int j =0;
            while(j<needle.length() && heystack.charAt(i+j) == needle.charAt(j)){
                j++;
            }
            if(j == needle.length()){
                return i;

        }
    }
        return -1;
    }
    public static void main(String args[]){
        System.out.println(strstr("hello", "ll"));
    }
}
//time complexity =o(n*m)--brute force mthds se kiye h