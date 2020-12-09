
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        int sumPositive=0;
        int count=0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int input=Integer.valueOf(scanner.nextLine());
            if (input>0) {
                sumPositive+=input;
                count++;
            }
            if (input==0) {
                if (sumPositive==0) {
                    System.out.println("Cannot calculate the average");
                    break;
                }   else {
                    System.out.println((double) sumPositive/count);
                    break;
                }                
            }        
        }
    }
}
