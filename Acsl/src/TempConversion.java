
import java.util.Scanner;
    public class TempConversion {
        static int s;
        public static void main(String[] args) {
            Scanner g = new Scanner(System.in);
            System.out.println("The temperature I want to convert is 1) celcius, 2) fahrenheigt");
            double s = g.nextDouble();
            if( s == 1) {
                System.out.println("Enter the degrees celcius: ");
                double t = g.nextDouble();
                System.out.println("It was converted to " + C2F(t));

            }
            else if (s == 2){
                System.out.println("Enter the degrees fahrenheit: ");
                double y = g.nextDouble();
                System.out.println("It was converted to " + F2C(y));


            }
            g.close();

        }
        public static double F2C(double a) {
            double c = s;
            a = (5/9)*(c-32);
            return a;
        }
        public static double C2F(double b) {
            double d = s;
            b = (5/9)*(d)+32;
            return b;
        }

    }