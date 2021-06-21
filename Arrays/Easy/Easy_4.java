package Arrays.Easy;
import java.io.*;
class Easy_4
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
       sort.order(array, size);
       sort.print(array, size);

       
   }
}
class sort
{
    public static void order(int array[], int size)
    {
        
        if(size==1)
        {
            return;
        }
        for(int i=0 ; i<size-1 ; i++)
        {
            if(array[i]>array[i+1])
            {
                int temp;
                temp=array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
            }
        }
        order(array,size-1);
    
} 
    public static void print(int array[],int size)
    {
        System.out.println("Sorted Array is = ");
        for(int j=0; j<=size-1; j++)
        {
            System.out.println(array[j]);
        }
    }
}
