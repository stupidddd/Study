package algorithm;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={10,7,2,4,7,62,3,4,2,1,8,9,19};
        quickSort(arr,0,arr.length-1);
        System.out.println("数组从小到大排序后为："+ Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high){
        if (low>=high){
            return;
        }
        int temp=arr[low];
        int i,j;
        i=low;
        j=high;
        while(i<j){
            while (arr[j]>=temp&&i<j){
                j--;
            }
            while (arr[i]<=temp&&i<j){
                i++;
            }
            if(i<j){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        arr[low]=arr[i];
        arr[i]=temp;
        quickSort(arr,low,j-1);
        quickSort(arr,j+1,high);
    }

}
