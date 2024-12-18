package org.example;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        int i = 5;
        int sum = i++ * ++i;
        System.out.println(sum);
        //System.out.println( "Hello World!" );

        boolean isPassed = true;
        boolean isStuff = false;

        String enterAccepted = isPassed == true || isStuff == true ? "Открыто" : "Доступ запрещен";
        System.out.println(enterAccepted);

        String bigAmount = "500";
        String greatAmount = "100000";

        int hugeAmount = Integer.parseInt(greatAmount) + Integer.parseInt(bigAmount); //напишите тут ваш код

        System.out.println(hugeAmount);

        // bool logic operators
        boolean a = true;
        boolean b = false;
        boolean c = a | b; //true
        boolean d = a & b; //false
        boolean e = a ^ b; //true
        boolean f = (!a & b) | (a & !b); //true
        boolean g = !a; //false

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);





    }

}
