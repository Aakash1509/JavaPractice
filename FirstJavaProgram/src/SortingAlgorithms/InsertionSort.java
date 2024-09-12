package SortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

public class InsertionSort {
    static void insertionSort(ArrayList<Integer> arr, int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr.get(j-1)>arr.get(j)){
                    swap(arr,j-1,j);
                }
                else{
                    break;
                }
            }
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
        insertionSort(numbers,n);
        System.out.println("After sorting");
        printArray(numbers,n);
    }
}
