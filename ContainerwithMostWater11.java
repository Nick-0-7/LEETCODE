import java.lang.*;
public class ContainerwithMostWater11 {
    public static void main(String args[]){
        int height[]={4,7,3,8,1};
        int maxCap=0,currentcap=0;
        int start=0;
        int end=height.length-1;
        while(start<end){
            int h=Math.min(height[start],height[end]);
            int w=end-start;
            currentcap=h*w;
            maxCap=Math.max(currentcap,maxCap);
            if(height[start]<height[end])
                    start++;
            else
                end--;

        }
        System.out.println(maxCap);
    }
    
}
