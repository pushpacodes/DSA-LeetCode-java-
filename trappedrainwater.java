import java.util.*;
public class trappedrainwater{
    public static void trappedrain(int height[]){
        int n = height.length;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                leftmax[i]=height[i];
            }
            else{
                leftmax[i]=Math.max(height[i],leftmax[i-1]);
            }
        }
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                rightmax[i]=height[i];
            }
            else{
                rightmax[i]=Math.max(height[i],rightmax[i+1]);
            }
        }
        int trappedwater=0;
        for(int i =0;i<n;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trappedwater+=waterlevel-height[i];
        }
        System.out.println("total trapped water is: "+trappedwater);
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        trappedrain(height);
    }
}