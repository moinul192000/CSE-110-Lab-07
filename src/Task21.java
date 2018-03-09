import java.util.Scanner;
public class Task21 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please type quantity of lines");
        int lineQuantity = sc.nextInt();

        for (int lineCount = 1; lineCount <= lineQuantity; ++lineCount){
            for (int spCount=1; spCount <= lineQuantity - lineCount; spCount++){
                System.out.print(" ");
            }
            for (int colCount = 1; colCount <= 2*lineCount - 1; colCount++){
                if(colCount == 1|| colCount == 2*lineCount - 1 || lineCount == lineQuantity){
                    System.out.print(colCount);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(); //Print Enter after every line of Stars.
        }
    }
}
