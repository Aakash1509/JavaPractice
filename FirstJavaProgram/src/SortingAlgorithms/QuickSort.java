package SortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

public class QuickSort {
    static int partition(ArrayList<Integer> arr, int low , int high){
        int pivot = arr.get(high);
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr.get(j)<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return (i+1);

    }
    static void printArray(ArrayList<Integer> arr, int n){
        for(int i:arr){
            System.out.println(i);
        }
    }
    static void quickSort(ArrayList<Integer> arr, int low, int high)
    {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(List.of(64, 34, 25, 12, 22, 11, 90));
        int n = numbers.size();
        quickSort(numbers, 0, n - 1);
        System.out.println("After sorting");
        printArray(numbers,n);
    }
}
