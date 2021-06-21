package Arrays.Medium;
import java.io.*;
class MED_4 
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
        find.Duplicate(array, size);
    }
}
class find
{
    public static void Duplicate(int array[] , int size)
    { 
        for (int i = 0; i < size; i++) 
        {
            array[array[i] % array.length]+= size;
        }
        System.out.println("The repeating elements are : ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= array.length * 2) {
                System.out.println(i + " ");
            }
        }
    }
}