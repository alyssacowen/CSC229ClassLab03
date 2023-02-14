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
       int[] arr = {55,7,20,4,88,44};
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
    }
}

