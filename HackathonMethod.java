
    
import java.util.Scanner;

class HackathonMethod {
    static double calculateTotalEnergy(double m, double e) {
        return m + e;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double m = sc.nextDouble();
        double e = sc.nextDouble();

        System.out.println("Total Energy: " + calculateTotalEnergy(m, e));
    }
}