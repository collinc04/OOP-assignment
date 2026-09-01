import java.util.Scanner;

public class thermometer {
    public static void main(String[] args) {
        Scanner thermo = new Scanner(System.in);

        int temp = thermo.nextInt();
        
        if(temp <= 32) {
            System.out.println("Freezing");
        } else if(temp <= 50) {
            System.out.println("Cold");
        } else if(temp <= 85) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
        }

        thermo.close();
    }
}
