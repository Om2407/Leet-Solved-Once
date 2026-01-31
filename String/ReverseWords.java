public class ReverseWords {

    public static String reverseWords(String s) {

        s = s.trim(); // leading & trailing spaces remove

        String[] words = s.split("\\s+"); // multiple spaces handle

        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);

            if (i != 0)
                sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  the sky   is blue  "));
    }
}
