public class StringCompression {
        public static String  CompressedString(String str){

            if(str==null || str.length()<0) return "";

            StringBuilder sb = new StringBuilder();
            int count = 1;

            for(int i=1; i<str.length(); i++){
                if(str.charAt(i) == str.charAt(i-1)){
                    count++;
                }else{
                    sb.append(str.charAt(i-1));
                    sb.append(count);
                    count = 1;
                }
            }
            sb.append(str.charAt(str.length()-1));
            sb.append(count);
            return sb.toString();
        }
        public static void main(String args[]){

            String str = "aabbccc";
            System.out.println(CompressedString(str));
        }
    }
    //time complexity o(n)
