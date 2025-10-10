import java.util.*;
public class kadanes {
    public static void kadanesalgo(int numbers[]){
        int ms= Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0;i< numbers.length;i++){
            cs = cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.print("maximum sum is: "+ms);
    }
    public static void main(String args[]){
        int numbers[]={-2,1,3,-6,12,4,-8,6};
        kadanesalgo(numbers);
    }
}
