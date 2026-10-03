import java.util.Scanner;

class Rooftop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int panelId;
        double energy;
        int numberOfPanels;
        char status;

        System.out.print("Enter Panel ID: ");
        panelId = sc.nextInt();

        System.out.print("Enter Energy Generated (kWh): ");
        energy = sc.nextDouble(); 

        System.out.print("Enter Number of Solar Panels: ");
        numberOfPanels = sc.nextInt();

        System.out.print("Enter System Status: ");
        status = sc.next().charAt(0);

        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated: " + energy + " kWh");
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + status);
    }
}