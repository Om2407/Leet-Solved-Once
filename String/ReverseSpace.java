
public class ReverseSpace {

    public static String reverseString(String str) {

        // 1. Trim & split on multiple spaces
        String[] words = str.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();

        // 2. Reverse word order
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "   hello   world  ";
        System.out.println(reverseString(str));
    }
}
