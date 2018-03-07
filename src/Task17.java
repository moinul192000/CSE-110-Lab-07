import java.util.Scanner;
public class Task17 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please type quantity of lines");
        int lineQuantity = sc.nextInt();
        int colCount;
        for (int lineCount = 1; lineCount <= lineQuantity; ++lineCount){

            for (colCount=1;colCount<=lineCount;++colCount){
                if(colCount == 1 || lineCount==colCount || lineCount==lineQuantity){
                    System.out.print(colCount);
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println(); //Print Enter after every line of Stars.
        }
    }
}
