package Arrays.Easy;
import java.io.*;
class Easy_6 
{
    public static void main(String args[]) throws IOException
    {
        System.out.println("Enter the size of array = ");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in)); // yaha p jo obj banega that will be in .readLine()
        int size = Integer.parseInt(read.readLine());
        System.out.println("Enter the elements of array = ");
        int[] array= new int[size];
        for(int x=0; x<size ;x++)
        {
            array[x]=Integer.parseInt(read.readLine());
        }
        System.out.println("Enter the element for which you wish to find the occurrence=");
        int element = Integer.parseInt(read.readLine());
        int counts =occur.occurrence(array, size, element);    //whenever any element is set to zero in other class then declare a new variable and give it that value and print
        System.out.printf("The element is occurred %d number of times in the given array",counts);
    }
}
class occur
{
    
public static int occurrence(int array[], int size, int element)
{
    int count=0;
    for(int i=0; i<size ; i++)
    {
        if(array[i]== element)
        {
            count++;
        }
    }
    return count;
}
}
