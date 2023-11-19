public class Algorithms
{
    public static int Alg1(int x) //The number of digits in the parameter
    {
        String y = String.valueOf(x);
        return y.length();

    }

    public static boolean Alg2(int x, int y) //Whether the first integer is divisible by the second
    {
        return x % y == 0;
    }

    public static int Alg3(int x, int y) //The sum of all odd numbers between the first parameter and the second, inclusive
    {
        int a = 0;
        while (x <= y+1)
        {
         if(x % 2 != 0)
         {
             a += x;
             x+=2;
         }
         else
         {
             x++;
         }
        }
        return a;
    }

    public static int Alg4(int x, int y) //The sum of all multiples of ten between the first parameter and the second, inclusive
    {
        int a = 0;
        while (x <= y)
        {
            if(x % 10 == 0)
            {
                a+=x;
            }
            x++;
        }
        return a;
    }

    public static int Alg5(int x) //The sum of the parameter's digits
    {
        String y = Integer.toString(x);
        int a = y.length();
        int z = 0;
        int b = 0;
        while (z != a) {
            b += (x % 10);
            x = (x / 10);
            z++;
        }
        return b;
    }

    public static int Alg6(int x) //The largest power of two less than or equal to a positive parameter
    {
        int y = 0;
        while((Math.pow(2,y+1) <= x))
        {
            y += 1;
        }
        return (int)Math.pow(2,y);
    }

    public static boolean Alg7(String x, String y) //Whether the second string occurs in the first.
    {
        return x.contains(y);
    }

    public static String Alg8(String x) //A string with the characters of the parameter reversed.
    {
        char z;
        StringBuilder y = new StringBuilder(" ");
        for (int i=0; i<x.length(); i++)
        {
            z= x.charAt(i);
            y.insert(0, z);
        }
        return y.toString();
    }

    public static boolean Alg9(String x) //Whether the parameter is a palindrome
    {
        char z;
        int b = x.length();
        StringBuilder y = new StringBuilder(" ");
        for (int i=0; i<b; i++)
        {
            z= x.charAt(i);
            y.insert(0, z);
        }
        String h = y.toString();
        return (h.contains(x));
    }

    public static int Alg10(String x, String y) //The number of occurrences of the second parameter in the first
    {
        int j = 0;
        for(int i = 0; i <= x.length() - y.length(); i++)
        {
            if (x.startsWith(y, i))
            {
                j ++;
            }
        }
        return j;
    }
}
