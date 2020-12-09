
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1=0;
        int container2=0;
        int maxweight=100;

        while (true) {
            System.out.println("First: "+container1+"/100");
            System.out.println("Second: "+container2+"/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }   else if (input.contains("add")) {
                String[] parts = input.split(" ");
                int amount = Integer.valueOf(parts[1]);
                if (amount<0) {
                    continue;
                }
                container1+=amount;
                if (container1>100) {
                    container1=100;
                }                
                continue;
            }   else if (input.contains("remove")) {
                String[] parts = input.split(" ");
                int amount = Integer.valueOf(parts[1]);
                if (amount<0) {
                    continue;
                }
                container2=container2-amount;
                if (container2<0) {
                    container2=0;
                }                  
                continue;
            }   else if (input.contains("move")) {
                String[] parts = input.split(" ");
                int amount = Integer.valueOf(parts[1]);
                if (amount<0) {
                    continue;
                }
                int resi = container1-amount;
                if (resi<=0) {
                    container2+=container1;
                }   else {
                    container2+=amount;
                }
                container1=container1-amount;
                if (container1<0) {
                    container1=0;
                }
                if (container2>100) {
                    container2=100;
                }                  
                continue;            

            }
        }
    }
}