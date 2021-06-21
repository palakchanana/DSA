package Arrays.Easy;
import java.io.*;
import java.util.HashSet;
class Easy_10
{
        public static void main(String[] args) throws IOException
    {
        System.out.println("Enter the size of array 1 = ");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int size_1 = Integer.parseInt(read.readLine());
        System.out.println("Enter the elements of array 1 = ");
        int array_1[] = new int[size_1];
        for(int x=0 ; x<size_1 ; x++)
        {
            array_1[x]=Integer.parseInt(read.readLine());
        }
        System.out.println("Enter the size of array 2 = ");
        int size_2 = Integer.parseInt(read.readLine());
        System.out.println("Enter the elements of array 2 = ");
        int array_2[] = new int[size_2];
        for(int y=0; y<size_2 ; y++)
        {
            array_2[y] = Integer.parseInt(read.readLine());
        }
        System.out.println("Union of array 1 and array 2 = ");
        Set.Union(array_1, array_2);
        System.out.println("Intersection of array 1 and array 2 = ");
        Set.Intersection(array_1, array_2);
    }    
}
class Set 
{
	public static void Union(int array_1[], int array_2[])
	{
		HashSet<Integer> hs = new HashSet<>();

		for (int i = 0; i < array_1.length; i++)
			hs.add(array_1[i]);
		for (int i = 0; i < array_2.length; i++)
			hs.add(array_2[i]);
		System.out.println(hs);
	}

	// Prints intersection of arr1[0..m-1] and arr2[0..n-1]
	public static void Intersection(int array_1[], int array_2[])
	{
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < array_1.length; i++)
			hs.add(array_1[i]);

		for (int i = 0; i < array_2.length; i++)
			if (hs.contains(array_2[i]))
				System.out.println(array_2[i] + "");
	}
}


