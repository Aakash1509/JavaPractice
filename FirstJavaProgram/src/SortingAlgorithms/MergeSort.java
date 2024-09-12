package SortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    static void conquer(int[] arr,int si,int mid,int ei){
        int[] merged = new int[ei-si+1];
        int idx1 = si; //Tracking array 1
        int idx2 = mid+1;// Tracking array 2
        int x=0; //Tracking merged array
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                merged[x++] = arr[idx1++];
            }
            else {
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        while(idx2<=ei){
            merged[x++]=arr[idx2++];
        }
        for(int i=0,j=si;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }
    static void divide(int[] arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);

    }
    static void printArray(int[] arr, int n){
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
//        ArrayList<Integer> numbers=new ArrayList<>(List.of(64, 34, 25, 12, 22, 11, 90));
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        divide(arr,0,n-1);
        System.out.println("After sorting");
        printArray(arr,n);
    }
}
