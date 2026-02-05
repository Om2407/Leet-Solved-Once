public class RemoveallAdjacent {

    public static String RemoveAdjacent(String str){

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);
            int leng = sb.length();

            if(leng > 0 && sb.charAt(leng - 1) == ch){
                sb.deleteCharAt(leng - 1);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String args[]){
        System.out.println(RemoveAdjacent("abbaca")); // ca
    }
}
