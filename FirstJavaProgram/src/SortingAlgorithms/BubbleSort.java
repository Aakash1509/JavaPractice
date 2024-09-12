package SortingAlgorithms;
import java.util.*;

import static java.util.Collections.swap;

public class BubbleSort {
    static void bubbleSort(ArrayList<Integer> numbers, int n){
        int i,j,temp;
        boolean swapped;
        for(i=0;i<n-1;i++){
            swapped=false;
            for(j=0;j<n-i-1;j++){
                if(numbers.get(j) > numbers.get(j + 1)){
                    swap(numbers,j,j+1); //Swap can't be used with object references
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }

    }
    static void printArray(ArrayList<Integer> arr, int n){
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
//        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        ArrayList<Integer> numbers=new ArrayList<>(List.of(64, 34, 25, 12, 22, 11, 90));
        int n = numbers.size();
        bubbleSort(numbers,n);
        System.out.println("After sorting");
        printArray(numbers,n);

    }
}
