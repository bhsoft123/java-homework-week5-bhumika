package printprogramme;

public class ProgHw9Operations
{
    public static void main(String[] args)
    {
        System.out.print("Test Data: a. ");
        byte a = -5;
        byte b = 8;
        byte c = 6;
        int result = (byte) (a + b * c);
        System.out.print(a);
        System.out.print("+");
        System.out.print(b);
        System.out.print("*");
        System.out.println(c);
        System.out.print("Expected output:");
        System.out.println(result);


        System.out.print("Test Data: b. ");
        int e = 55;
        int f = 9;
        int g = 9;
        int result2 = (e + f) ;
        int result1 = result2 % g;
        System.out.print(e);
        System.out.print("+");
        System.out.print(f);
        System.out.print("%");
        System.out.println(g);
        System.out.print("Expected output:");
        System.out.println(result1);

        System.out.print("Test Data: c. ");
        byte h = 20;
        byte i = -3;
        byte j = 5;
        byte k = 8;
        int result4 = h + i * j / k;
        System.out.print(h);
        System.out.print("+");
        System.out.print(i);
        System.out.print("*");
        System.out.print(j);
        System.out.print("/");
        System.out.println(k);
        System.out.print("Expected output:");
        System.out.println(result4);

        System.out.print("Test Data: c. ");
        byte l = 5;
        byte m = 15;
        byte n = 3;
        byte o = 2;
        byte p = 8;
        byte q = 3;
        int result5 = l + m / n * o - p % q;
        System.out.print(l);
        System.out.print("+");
        System.out.print(m);
        System.out.print("/");
        System.out.print(n);
        System.out.print("*");
        System.out.print(o);
        System.out.print("-");
        System.out.print(p);
        System.out.print("%");
        System.out.println(q);
        System.out.print("Expected output:");
        System.out.println(result5);

    }
}

