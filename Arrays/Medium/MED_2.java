package Arrays.Medium;
import java.io.*;

class MED_2 
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter the size of array = ");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(read.readLine());
        System.out.println("Enter the elements = ");
        int array[] = new int[size];
        for(int x=0 ; x<size ; x++)
        {
            array[x] = Integer.parseInt(read.readLine());
        }
        System.out.printf("Missing number = %d ",elements.Missing(array, size));
        
    }
}
class elements
{
    public static int Missing(int array[], int size)
    {
        int sum = 1;
        for (int i = 2; i <= (size + 1); i++)
        {
            sum += i;
            sum -= array[i - 2];
        }
        return sum;
    }
}

