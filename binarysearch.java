public class binarysearch{
    public static int search(int numbers[],int key){
        int low =0;
        int high=numbers.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(numbers[mid]==key){
                return mid;
            }
            else if(numbers[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12};
        int key = 10;
        int a = search(numbers,key);
        if(a==-1){
            System.out.print("key not found");
        }
        else{
            System.out.print("key found at index "+a);
        }
    }
}