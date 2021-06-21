package Arrays.Easy;
import java.io.*;
class Easy_7 
{
 public static void main(String[] args) throws IOException
 {
     System.out.println("Enter the size of array = ");
     BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
     int size= Integer.parseInt(read.readLine());
     int[] array= new int[size];
     System.out.println("Enter the elements of array in 0s 1s 2s =");
     for(int x=0; x<size ; x++)
     {
         array[x] = Integer.parseInt(read.readLine());
     }
     sorting.sort(array, size);
   
 }   
}
class sorting
{
    public static void sort(int array[],int size)
    {
        int i=0;
        int count_0 = 0; //for counting 0s
        int count_1 = 0;
        int count_2 = 0;
        for(i=0; i<size ;i++)
        {
            switch(array[i])
            {
                case 0 :
                    count_0++;
                break;

                case 1 :
                    count_1++;
                break;

                case 2 :
                    count_2++;
                break;
            }
        }
            i=0;
        
        
        while(count_0>0)
        {
            array[i++]=0;
            count_0--;
        }
        while(count_1>0)
        {
            array[i++]=1;
            count_1--;
        }
        while(count_2>0)
        {
            array[i++]=2;
            count_2--;
        }
        System.out.println("The sorted array is =");
        for(i=0; i<=size-1; i++)
        {
            System.out.println(array[i]);
        }
    }
}
