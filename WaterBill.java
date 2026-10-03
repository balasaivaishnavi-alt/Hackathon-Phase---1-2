import java.util.Scanner;

public class WaterBill
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter water consumption in litres: ");
        double water = sc.nextDouble();

        if (water <= 500)
        {
            System.out.println("Water Bill: Rs.100");
        } 
        else
        {
            System.out.println("Water Bill: Rs.200");
        }
    }
}