// import java.util.Scanner;
// public class hello{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int num [] = new int [size];

//         int sum =0;
//         for(int i=0; i<size; i++){
//             sum = sum + i;
//         }
// System.out.println(sum);
//     }
// }
public class PairSumTwoPointer {
    public static boolean pairExists(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == x) {
                return true;
            } else if (sum < x) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 8};
        int x = 10;
        System.out.println(pairExists(arr, x));
    }
}
