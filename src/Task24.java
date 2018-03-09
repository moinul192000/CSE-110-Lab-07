import java.util.Scanner;
public class Task24 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        for(int n = 1; n <= number;n++){
            System.out.print(n);
        }
        for(int n = number-1 ; n >= 1;n--){
            System.out.print(n);
        }
    }
}
