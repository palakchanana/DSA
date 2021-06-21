package Arrays.Easy;

import java.io.*;

class Easy_1
{
    public static void main(String args[])throws IOException
    {
        System.out.println("Enter the size of array=");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(read.readLine());
		System.out.println("Enter the elements of array = ");
        int array[] = new int[size];
		for(int i=0; i<size ;i++)
		{			
			array[i]=Integer.parseInt(read.readLine());
		}
		System.out.println("Enter the key to be checked = ");
		int key = Integer.parseInt(read.readLine());
		System.out.println("Enter the size of segment = ");
		int seg = Integer.parseInt(read.readLine());
		
        while(size-- >0)
        {
			check.find(size , array , key , seg);
		
        }
		if (check.find(size, array, key, seg))
			System.out.println("Yes");
			else
			System.out.println("No");
    }
}
class check {
	static boolean find(int size, int[] array,int key, int seg)
	{
		int y;
		boolean b = false;
	
		// Iterate from 0 to size - 1
		for (y = 0; y < size; y = y + seg) 
		{
			// Iterate from 0 to seg - 1
			for (int j = 0; j < seg; j++)  //yaha p segment tk loop h because hum aage har segment ki ek ek value check krenge 
			{
				if (y + j < size && array[y + j] == key)
					break;

				if (j == seg)
					return false;
				if (y + j >= size)
					return false;
			}
		}
		
		if (y >= size)
			return true;
		else
			return b;
	}

}
