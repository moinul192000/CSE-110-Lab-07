import java.util.Scanner;
public class Task3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please type quantity of lines");
        int lineQuantity = sc.nextInt();

        System.out.println("Please type quantity of Stars");
        int starQuantity = sc.nextInt();

        for (int lineCount = 1; lineCount <= lineQuantity; ++lineCount){

            for (int starCount = 1; starCount <= starQuantity; ++starCount){
                System.out.print("*");
            }

            System.out.println(); //Print Enter after every line of Stars.
        }
    }
}
