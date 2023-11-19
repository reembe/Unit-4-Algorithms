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

}

