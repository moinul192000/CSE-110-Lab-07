import java.util.Scanner;
public class Task18 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please type quantity of lines");
        int lineQuantity = sc.nextInt();
        for (int lineCount = 1; lineCount <= lineQuantity; ++lineCount){

            for (int spaceCount = 1; spaceCount <= (lineQuantity-lineCount); ++spaceCount){
                System.out.print(" ");
            }
            for (int starCount = 1; starCount <= lineCount; ++starCount){
                if (lineCount==lineQuantity || lineCount==starCount || starCount==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println(); //Print Enter after every line of Stars.
        }
    }
}
