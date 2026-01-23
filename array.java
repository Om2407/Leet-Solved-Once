import java.util.Scanner;
public class array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array : ");
        int size = sc.nextInt();
        
        int num[] = new int [size];

        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
             }
             //searching
             int x = sc.nextInt();

             for(int i=0; i<num.length; i++){
                if(num[i] ==x){
                    System.out.println("searching element : " +i);
               
             }
        }
        sc.close();
    }
}