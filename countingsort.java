import java.util.*;
public class countingsort {
    public static void counting(int arr[]){
        int n = arr.length;
        int largest = arr[0];
        for(int i =0;i<n;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i =0;i<n;i++){
            count[arr[i]]++;
        }
        int j =0;
        for(int i =0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }        
        }
    }
    public static void main(String args[]){
        int arr[]={4,2,2,8,3,3,1};
        counting(arr);
        for(int i =0;i<arr.length;i++){
            System.out.println((i+1)+" is "+arr[i]);
        }
    }
}
