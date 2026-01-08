public class insertionsort {
    public static void insertion(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int prev = i-1;
            int curr=arr[i];
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        for(int i =0;i<n;i++){
            System.out.println((i+1)+" is "+arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        insertion(arr);
    }
}
