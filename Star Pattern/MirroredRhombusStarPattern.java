import java.util.Scanner;

public class MirroredRhombusStarPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int rows = sc.nextInt();
        for(int i=0; i<rows; i++) // loop controlling number of rows
        {
            for(int j=rows; j>i; j--) //inner loop for spaces
                System.out.print(" "); //printing spaces
            for(int j=0; j<rows; j++)//inner loop for printing the stars in each column of a row
                System.out.print("*");//printing stars
            System.out.println();//printing a new line after each row
        }
    }
}
