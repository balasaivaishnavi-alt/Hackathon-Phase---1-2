import java.util.Scanner;

public class WaterConsumption
{
    static int calculateTotal(int morningUsage, int eveningUsage)
    {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter morning usage: ");
        int morningUsage = sc.nextInt();

        System.out.print("Enter evening usage: ");
        int eveningUsage = sc.nextInt();

        int total = calculateTotal(morningUsage, eveningUsage);

        System.out.println("Total water consumption: " + total + " litres");
    }
}