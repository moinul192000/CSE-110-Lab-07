import java.util.Scanner;
public class Task14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter Length and Width");
        int lineLimit = sc.nextInt();
        int columnLimit = sc.nextInt();
        int columnCount;
        int lineCount;
        for (lineCount = 1; lineCount <= lineLimit; ++lineCount){
            for (columnCount = 1; columnCount <= lineLimit; ++columnCount){
                if(lineCount == 1 || columnCount == 1 || lineCount == lineLimit || columnCount == columnLimit){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
