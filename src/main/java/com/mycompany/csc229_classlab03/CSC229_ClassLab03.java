package com.mycompany.csc229_classlab03;
import java.util.*;
/**
 *
 * @author alyssacowen
 */
public class CSC229_ClassLab03 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       
       //here I created an array
       int[] arr = {55,7,20,1,4,88,44,31,8};
       //here I called my arraySort method
       arraySort(arr);
       System.out.print("Enter the value you want to search for: ");
       int value = sc.nextInt();
       //value searched for with binary search
        int binary = binarySearch(arr, value);
        if (binary != -1) {
            System.out.println("During the binary search, your value was found at: " + binary);
        } else {
            System.out.println("The value you entered does not exist.");
        }
        //value searched for with linear search

        int linear = linearSearch(arr, value);
        if (linear != -1) {
            System.out.println("During the linear search, your value was found at: " + linear);
        } else {
            System.out.println("The value you entered does not exist.");
        }

    }
    //here I created a method to sort the array (chose bubble sort)
    public static void arraySort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr [j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
        }
    }
        //here I printed out the sorted array
        System.out.println("Here is the array sorted: ");
        for (int j = 0; j < arr.length; j++) {
             System.out.println(arr[j]);
        }
         
       
    }
         
    public static int binarySearch(int[] arr, int value) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] < value) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }

    
    public static int linearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}

    
    
    


