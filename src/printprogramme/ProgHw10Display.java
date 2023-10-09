package printprogramme;

public class ProgHw10Display
{
    public static void main (String [] args)
    {
        System.out.print("Input first number:");
        int firstnumber = 25;
        System.out.println(firstnumber);
        System.out.print("Input second number:");
        int secondnumber = 5;
        System.out.println(secondnumber);

        System.out.print(firstnumber);
        System.out.print("X");
        System.out.print(secondnumber);
        System.out.print("=");
        System.out.println(firstnumber * secondnumber);
    }
}
