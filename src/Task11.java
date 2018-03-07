import java.util.Scanner;
public class Task11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please type quantity of lines");
        int lineQuantity = sc.nextInt();
        int spaceCount;
        for (int lineCount = 1; lineCount <= lineQuantity; ++lineCount){

            for (spaceCount = 1; spaceCount <= (lineQuantity-lineCount); ++spaceCount){
                System.out.print(" ");
            }
            for (int columnCount = lineQuantity; columnCount>=lineCount ; --columnCount){
                System.out.print(columnCount);
            }



            System.out.println(); //Print Enter after every line of Stars.
        }
    }
}
