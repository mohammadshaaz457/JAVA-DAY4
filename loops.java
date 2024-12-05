public class loops
{    
    public static void main(String[] args) 
    {
        // Using a for loop to print numbers from 1 to 10
        System.out.println("Using for loop:");
        for (int i = 1; i <= 10; i++)
         {
            System.out.println(i);
        }

        // Using a while loop to print numbers from 1 to 10
        System.out.println("\nUsing while loop:");
        int j = 1;
        while (j <= 10) 
        {
            System.out.println(j);
            j++;
        }

        // Using a do-while loop to print numbers from 1 to 10
        System.out.println("\nUsing do-while loop:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 10);
    }
}
