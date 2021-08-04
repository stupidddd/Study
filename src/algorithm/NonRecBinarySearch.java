package algorithm;

public class NonRecBinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int key=7;
        int result=binarySearch(arr,key,0,arr.length-1);
        System.out.println(key+"在索引为"+result+"的位置");
    }

    public static int binarySearch(int[] arr,int key,int low,int high){
        int mid=0;
        while (low<=high){
            mid=(low+high)/2;
            if(arr[mid]==key){
                break;
            }else if(arr[mid]>key){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return mid;
    }
}
