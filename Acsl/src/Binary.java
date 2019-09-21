

import java.util.Scanner;
public class Binary {

    public static void main(String[] args){
        Scanner g = new Scanner(System.in);
        System.out.println("The number I would like to convert to a binary number is");
        double s = g.nextDouble();

        decToBinary((int) s);

    }
    static void decToBinary(int n)
    {

        int[] binaryNum = new int[1000];


        int i = 0;
        while (n > 0)
        {

            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }


        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
}
