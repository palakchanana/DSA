package Arrays.Easy;

import java.io.*;

class Easy_3
{

    public static void main(String[] args) throws IOException
     {
        
        System.out.println("Enter the size of array=");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(read.readLine());
		System.out.println("Enter the elements of array = ");
        int array[] = new int[size];
		for(int x=0; x<size ;x++)
		{			
			array[x]=Integer.parseInt(read.readLine());
        }   
        int start=0;
        int end=size-1;
        reverse.rev_arr(array, start , end );
        reverse.print(array, size);

        
    }
}
class reverse
{
    public static void rev_arr(int array[], int start, int end)  // to reverse the array
    {
        if(start>=end)
        {
            return;
        }
        int temp = array[start];
        array[start]=array[end];
        array[end]=temp;
        rev_arr(array, start+1, end-1);
    }
    public static void print(int array[],int size)
    {
        System.out.println("Reversed array is = ");
        for(int i=0; i<=size-1; i++)
        {
            System.out.println(array[i]);
        }
    }
}