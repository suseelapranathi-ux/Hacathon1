
    
import java.util.Scanner;

class HackathonIfelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double energy;

        System.out.print("Enter Energy Generated (kWh): ");
        energy = sc.nextDouble();

        if (energy >= 10) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }
    }
}
