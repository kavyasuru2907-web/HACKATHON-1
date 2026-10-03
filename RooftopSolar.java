import java.util.Scanner;

public class RooftopSolar 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Panel ID: ");
        int panelId = sc.nextInt();

        System.out.print("Enter Energy generated in kWh: ");
        double energy = sc.nextDouble();

        System.out.print("Enter Number of solar panels: ");
        int panels = sc.nextInt();

        System.out.print("Enter System status: ");
        char status = sc.next().charAt(0);

        System.out.println("\n--- Rooftop Solar System Details ---");
        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy generated: " + energy + " kWh");
        System.out.println("Number of solar panels: " + panels);
        System.out.println("System status: " + status);

        sc.close();
    }
}