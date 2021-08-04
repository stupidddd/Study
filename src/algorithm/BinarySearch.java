package algorithm;

import java.security.Key;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int key=8;
        int result=binarySearch(arr,key,0,arr.length-1);
        System.out.println(key+"在索引为"+result+"的位置");
    }

    public static int binarySearch(int[] arr, int key, int low, int high){
        int mid=(low+high)/2;
        if(key==arr[mid]){
            return mid;
        }else if(key>arr[mid]){
            return binarySearch(arr,key,mid+1,high);
        }else {
            return binarySearch(arr,key,low,mid-1);
        }

    }
}
