package Arrays.Medium;
import java.io.*;

class MED_1
{
	public static void main(String[] args) throws IOException
	{
        System.out.println("Enter the size of array = ");
	    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(read.readLine()); // Inputting the testcases
        System.out.println("Enter the elements of array = ");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) 
        {
            array[i] = Integer.parseInt(read.readLine());
        }  
        Cycically.rotate(array , size);         
        }
	}

class Cycically 
{    
    public static void rotate(int array[], int size)
    {
       
       int end = array[size-1];
       for(int i = size-2; i>=0; i--)
       {
           array[i+1]  = array[i];
       }
       array[0] = end;        
    
     System.out.println("Rotated Array is = ");
        for(int i=0; i<=size-1; i++)
        {
            System.out.println(array[i]);
        }
    }
}

