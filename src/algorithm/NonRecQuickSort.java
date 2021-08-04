package algorithm;

import java.util.Arrays;
import java.util.Stack;

public class NonRecQuickSort {
    public static void main(String[] args) {
        int[] arr={5,2,4,9,8,7,3,6,1};
        quickSort(arr,0,arr.length-1);
        System.out.println("数组从小到大排序后为："+Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int low,int high){
        Stack<Integer> stack=new Stack<>();
        stack.push(low);
        stack.push(high);
        while (!stack.isEmpty()){
            int r=stack.pop();
            int l=stack.pop();
            int index=partition(arr,l,r);
            if(l<index-1){
                stack.push(l);
                stack.push(index-1);
            }
            if(r>index+1){
                stack.push(index+1);
                stack.push(r);
            }
        }
    }
    public static int partition(int[] arr, int start, int end){
        int temp,i,j;
        temp=arr[start];
        i=start;
        j=end;
        while (i<j){
            while (arr[j]>=temp&&i<j){
                j--;
            }
            while(arr[i]<=temp&&i<j){
                i++;
            }
            if(i<j){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        arr[start]=arr[i];
        arr[i]=temp;
        return i;
    }
}
