import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    
    // Prompt the user for the number of integers to enter
    //System.out.print("Enter the number of integers: ");
    int input = in.nextInt();

    // Read in the set of integers
    int[] ints = new int[input];
    for (int i = 0; i < input; i++) 
    {
        //System.out.print("Enter an integer: ");
        ints[i] = in.nextInt();
    }

    // Find the mode of the set
    int mode = 0;
    int maxCount = 0;
    for (int i = 0; i < input; i++) 
    {
        int count = 0;
        for (int j = 0; j < input; j++) 
        {
            if (ints[j] == ints[i]) 
            {
                count++;
            }
        }

        if (count > maxCount) 
        {
            maxCount = count;
            mode = ints[i];
        }
    }
    
    // Print out the mode
    System.out.println(mode);
    
    in.close();

  }
}
