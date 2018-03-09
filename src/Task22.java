import java.util.Scanner;
public class Task22 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Line Quantity: ");

        int lineQuantity = sc.nextInt();
        //    For Upper Triangle
        for (int lineCount = 1; lineCount<=lineQuantity;lineCount++){
            for (int spaceCount = 1; spaceCount <= (lineQuantity-lineCount);spaceCount++){
                System.out.print(" ");
            }
            for (int colCount = 1; colCount <= (2*lineCount-1);colCount++){
                if(colCount == 1|| colCount == 2*lineCount - 1 ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        //      For Lower Triangle
        for (int lineCount = 1; lineCount<=(lineQuantity-1);lineCount++){
            for (int spaceCount = 1; spaceCount<=lineCount; spaceCount++){
                System.out.print(" ");
            }
            for (int colCount = 1; colCount <= (2*lineQuantity-1)-2*lineCount;colCount++){
                if(colCount == 1|| colCount == (2*lineQuantity-1)-2*lineCount){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
