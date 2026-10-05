package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int numSalesPeople;
        System.out.print("Enter the number of salespeople: ");
        numSalesPeople = scan.nextInt();
        int[] sales = new int[numSalesPeople];  // initializing the sales array
        int sum;

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("\nEnter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();  // reading the values of the array
        }

        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int maxIdx = 0;
        int minIdx = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];  // calculating the sum
            if (sales[i] > sales[maxIdx]) maxIdx = i;  // searching for the index of the min sales value
            if (sales[i] < sales[minIdx]) minIdx = i;  // searching for the index of the max sales value
        }

        //displaying results
        System.out.println("\nTotal sales: " + sum);

        double avg = (double) sum / sales.length;
        System.out.println("\nAverage sale: " + avg);

        System.out.println("\nSalesperson " + (maxIdx+1) + " had the highest sale with $" + sales[maxIdx]);

        System.out.println("\nSalesperson " + (minIdx+1) + " had the lowest sale with $" + sales[minIdx]);

        int val;
        System.out.print("\nEnter a value: ");
        val = scan.nextInt();
        int count = 0;
        // displaying the salespeople whose sales exceed the value and their number
        System.out.println("The salespeople whose sales exceeded " + val + " are:");
        for (int i = 0; i < sales.length; i++){
            if (sales[i] > val){
                System.out.println("Salesperson " + (i+1) + " with $" + sales[i]);
                        count++;
            }
        }
        System.out.println("\nThe number of salespeople whose sales exceeded " + val + " is: " + count);
    }
}