import java.util.Scanner;

public class tickets {
    public static void main(String[] args) {
        Scanner ticketCounter = new Scanner(System.in);

        int input = ticketCounter.nextInt();
        System.out.println(input * 15);

        ticketCounter.close();
    }
}
