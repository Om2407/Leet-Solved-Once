public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i); // Odd length
            int len2 = expand(s, i, i + 1); // Even length
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2; // start index ka formula
                end = i + len / 2; // end index ka formula
            }
        }
        return s.substring(start, end + 1);
    }
    private static int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() 
            && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
    public static void main(String[] args) {
        String s = "babad";
        System.out.println("Longest Palindrome of \"" + s + "\" is: " + longestPalindrome(s));
    }
}
//time complexity: O(n^2)
//space complexity: O(1)    
//explanation of the code:
// hum har character ko center maan ke expand karte hain dono sides mein
// odd length ke liye center ek character hota hai (i,i)    
// even length ke liye center do characters hote hain (i,i+1)
// har expansion ke baad hum check karte hain ki jo palindrome mila wo ab tak ka longest hai ya nahi
// agar longest mila to uske start aur end indices ko update karte hain
// finally substring method se longest palindrome return karte hain
//example: "babad"
// i=0: center 'b', palindrome "b", length 1
// i=1: center 'a', palindrome "bab", length 3 (longest so far)
// i=2: center 'b', palindrome "aba", length 3 (ties with
// i=3: center 'a', palindrome "ada", length 3 (ties with)
// i=4: center 'd', palindrome "d", length 1
// longest palindrome is "bab" or "aba"
//Note: there can be multiple longest palindromic substrings of same length
// hum pehla wala return kar rahe hain
//yeh approach O(n^2) time complexity mein kaam karti hai aur O(1) space leti hai
// kyunki hum extra space nahi le rahe hain except for variables
//is code ko samajhne ke liye expand function pe dhyan dena zaroori hai
// yeh function left aur right pointers ko expand karta hai jab tak characters match karte hain
// aur phir palindrome ki length return karta hai
//substring method ka use karke hum original string se longest palindrome extract karte hain
//yeh code efficiently longest palindromic substring find karta hai without using extra space for storing substrings
// aur har character ko center maan ke expand karta hai to cover all possible palindromes
//is approach ko "Expand Around Center" technique kehte hain
//yeh technique simple aur effective hai longest palindromic substring problem ke liye
//is code ko run karne ke liye main method mein string provide kar sakte hain
//aur output mein longest palindromic substring dekh sakte hain
//Example run: "babad" -> Output: "bab" or "aba"
//Example run: "cbbd" -> Output: "bb"
//Example run: "a" -> Output: "a"
//Example run: "ac" -> Output: "a" or "c"
//Example run: "forgeeksskeegfor" -> Output: "geeksskeeg"
//Example run: "abccba" -> Output: "abccba"
///next steps: is code ko aur optimize karne ke liye Manacher's Algorithm use kar sakte hain