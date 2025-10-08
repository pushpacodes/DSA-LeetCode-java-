public class linearsearch{
    public static int  linear (int numbers[],int key){
        for(int i =0 ; i<numbers.length;i++){
            if(numbers[i]==key){
                return numbers[i];
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={0,2,4,6,8,12,14,16};
        int key = 24;
        int a=linear(numbers,key);
        if (a==-1){
            System.out.print("not found");
        }
        else{
            System.out.print("key found at index"+a);
        }
    }
}
