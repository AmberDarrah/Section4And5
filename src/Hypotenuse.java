import java.util.Scanner;
public class Hypotenuse
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        double side1, side2, hypotenuse;
        System.out.print("Side 1: ");
        side1 = sc.nextDouble();
        System.out.print("Side 2: ");
        side2 = sc.nextDouble();
        hypotenuse = Math.sqrt((side1*side1)+(side2*side2));
        System.out.println("Hypotenuse: " + hypotenuse);
    }
}
