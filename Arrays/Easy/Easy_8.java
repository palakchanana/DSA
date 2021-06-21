package Arrays.Easy;

import java.io.*;



class Easy_8
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
             
        Pair minmax=Find(array ,size); //beacuse we are returning values to min and max
        float range=minmax.max-minmax.min;
        float coefficient=range/(minmax.max+minmax.min);
        System.out.printf("Range= %f",range);
        System.out.printf("\nCoefficient= %f",coefficient);
    }

    // Class Pair is used to return two values 
       public static class Pair 
       {    
            int min;
            int max;
        }
    
       public static Pair Find(int array[], int size)  //public static pair is because it will return min and max
       {
            Pair minmax = new Pair();
            int i;
            // If array has even number of elements then initialize the first two elements as minimum and maximum 
            if (size % 2 == 0) 
            {
                if (array[0] > array[1]) 
                {
                    minmax.max = array[0];
                    minmax.min = array[1];
                } 
                else
                {
                    minmax.min = array[0];
                    minmax.max = array[1];
                }
                i = 2;
                // set the starting index for loop because 0th and 1st index ha sfound min and max
            } 
            // If array has odd number of elements then initialize the first element as minimum and maximum 
            else
            {
                minmax.min = array[0];
                minmax.max = array[0];
                i = 1;
               // set the starting index for loop 
            }
    
            // In the while loop, pick elements in pair and compare the pair with max and min so far 
            while (i < size - 1) 
            {
                if (array[i] > array[i + 1]) 
                {
                    if (array[i] > minmax.max) 
                    {
                        minmax.max = array[i];
                    }
                    if (array[i + 1] < minmax.min) 
                    {
                        minmax.min = array[i + 1];
                    }
                } 
                else 
                {
                    if (array[i + 1] > minmax.max) 
                    {
                        minmax.max = array[i + 1];
                    }
                    if (array[i] < minmax.min) 
                    {
                        minmax.min = array[i];
                    }
                }
                i += 2;
                //Increment the index by 2 as two elements are processed in loop 
            }
    
            return minmax;
        }

    
        }
    

    

