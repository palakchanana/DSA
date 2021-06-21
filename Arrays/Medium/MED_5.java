package Arrays.Medium;

import java.io.*;

class MED_5 {
    public static void main(String[] args) throws IOException 
    {
        System.out.println("Enter the size of array = ");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(read.readLine());
        System.out.println("Enter the elements of array = ");
        int[] array = new int[size];
        for (int x = 0; x < size; x++) 
        {
            array[x] = Integer.parseInt(read.readLine());
        }
        sorting.quickSort(array, 0, size - 1);
        System.out.println("Sorted array: ");
        sorting.printArray(array, size);
    }
}

class sorting 
{
    public static void swap(int[] array, int i, int j) 
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) 
        {
            if (array[j] < pivot) 
            {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return (i + 1);
    }
    public static void quickSort(int[] array, int low, int high) 
    {
        if (low < high) 
        {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // Function to print an array
    public static void printArray(int[] array, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(array[i] + " ");

    }
}
