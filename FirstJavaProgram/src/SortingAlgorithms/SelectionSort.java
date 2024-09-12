package SortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

public class SelectionSort {
    static void selectionSort(ArrayList<Integer> arr, int n){
        for(int i=0;i<n-1;i++){
            int min_idx=i;
            for(int j=i+1;j<n;j++){
                if(arr.get(min_idx)> arr.get(j)){
                    min_idx=j;
                }
            }
            swap(arr,i,min_idx);
        }
    }
    static void printArray(ArrayList<Integer> arr, int n){
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(List.of(64, 34, 25, 12, 22, 11, 90));
        int n = numbers.size();
        selectionSort(numbers,n);
        System.out.println("After sorting");
        printArray(numbers,n);
    }
}
