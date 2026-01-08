import java.util.*;
public class selection {
    public static void selectionsort(int arr[]){
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            int smallest = i;
            for(int j =i+1;j<n;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for(int i =0;i<n;i++){
            System.out.println((i+1)+" is "+arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={64,25,12,22,11};
        selectionsort(arr);
    }
}
