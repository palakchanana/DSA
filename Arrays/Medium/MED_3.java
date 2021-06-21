package Arrays.Medium;
import java.io.*;
import java.util.HashMap;

public class MED_3 
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter the size of array = ");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(read.readLine());
        System.out.println("Enter the elements of array = ");
        int[] array = new int[size];
        for(int x=0 ; x<size ; x++)
        {
            array[x] = Integer.parseInt(read.readLine());
        }
        System.out.println("Enter the sum for which you wish to find the pairs = ");
        int sum = Integer.parseInt(read.readLine());
        System.out.printf("The number of pairs with given sum is = %d",Solution.getPairsCount(size, sum, array));
    }
}
class Solution
{
    public static int getPairsCount(int size, int sum, int array[])
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < size; i++) 
        {
            if (!hm.containsKey(array[i]))
                hm.put(array[i], 0);
 
            hm.put(array[i], hm.get(array[i]) + 1);
        }
        int twice_count = 0;
        for (int i = 0; i < size; i++) 
        {
            if (hm.get(sum - array[i]) != null)
                twice_count += hm.get(sum - array[i]);
            if (sum - array[i] == array[i])
                twice_count--;
        }
        return twice_count / 2;
    }
}

