
//stringBuilder approach
public class Palindrome {
 public static boolean isPalindrome(String str){
    String reversed = new StringBuilder(str).reverse().toString();
    return str.equals(reversed);
 }
 public static void main(String args[]){
    // String str = "madam";
 
    System.out.println("Is the string a palindrome? " + isPalindrome("madam"));
    System.out.println("Is the string a palindrome? " + isPalindrome("hello"));
 }
}
//best
// public class Palindrome {
//  public static Boolean isPalindrome(String str){

//     int left = 0;
//     int right = str.length()-1;

//     StringBuilder sb = new StringBuilder();

//     while(left < right){
//         if(str.charAt(left) != str.charAt(right)){
//             return false;
//         }
//         left ++;
//         right--;
//     }
//     return true;

//  }
//  public static void main(String args[]){
//     System.out.println(isPalindrome("madam"));
//     System.out.println(isPalindrome("helo"));
//  }
// }
