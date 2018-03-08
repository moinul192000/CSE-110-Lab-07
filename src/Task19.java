import java.util.Scanner;
public class Task19 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please type quantity of lines");
        int lineQuantity = sc.nextInt();
        for (int lineCount = 1; lineCount <= lineQuantity; ++lineCount){

            for (int spaceCount = 1; spaceCount <= (lineQuantity-lineCount); ++spaceCount){
                System.out.print(" ");
            }
            for (int colCount = 1; colCount <= lineCount; ++colCount){
                if (lineCount==lineQuantity || lineCount==colCount || colCount==1){
                    System.out.print(colCount);
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println(); //Print Enter after every line of cols.
        }
    }
}
