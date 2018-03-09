import java.util.Scanner;
public class Task25 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please type quantity of lines");
        int lineQuantity = sc.nextInt();

        for (int lineCount = 1; lineCount <= lineQuantity; ++lineCount){
            for (int spCount=1; spCount <= lineQuantity - lineCount; spCount++){
                System.out.print(" ");
            }
            for(int n = 1; n <= lineCount;n++){
                System.out.print(n);
            }
            for(int n = lineCount-1 ; n >= 1;n--){
                System.out.print(n);
            }
            System.out.println(); //Print Enter after every line of Stars.
        }
    }
}
