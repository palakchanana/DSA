package Arrays.Easy;
import java.io.*;
class Easy_9 
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
        move.move_neg(array, size);
    }
}
class move
{
    static void move_neg(int array[], int size)
	{
		int j = 0, temp;
		for (int i = 0; i < size; i++) 
        {
			if (array[i] <=0) 
            {
				if (i != j) 
                {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				j++;
			}
		}
	System.out.println("Sorted array is =");
    for(int i = 0; i <size; i++)
    {
	System.out.print(array[i] + " ");
	}
}
}


