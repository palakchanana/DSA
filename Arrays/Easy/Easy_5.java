package Arrays.Easy;

import java.io.*;

class Easy_5 {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter the size of array=");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(read.readLine());
        System.out.println("Enter the elements of array = ");
        int array[] = new int[size];
        for (int x = 0; x < size; x++) {
            array[x] = Integer.parseInt(read.readLine());
        }
        System.out.println("Enter the kth largest and smallest you wish to find  = ");
        int k = Integer.parseInt(read.readLine());
        sort.order(array, size);
        Pair minmax = kth(array, k, size);
        System.out.printf("kth Largest element is = %d ",minmax.max);
        System.out.printf("\n kth Smallest element is = %d ",minmax.min);

    }

    public static class Pair 
    {
        int min;
        int max;
    }

    public static Pair kth(int[] array, int k, int size) 
    {
        Pair minmax = new Pair();
        minmax.max = array[size - k]; //once the array is sorted then the kth value will be easily found
        minmax.min = array[k - 1];
        return minmax;
    }
}