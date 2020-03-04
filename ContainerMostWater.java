//Cole Constantino | Container with most water
import java.util.*;
public class ContainerMostWater {
    public static int maxArea(int[] height) {
        
        //for loop from left and right side while left < right 
        //save area to tempArea
        //whatever side is smaller -> iterate that way and check again
        // test case: {1,8,6,2,5,4,8,3,7}
            
        int i = 0; //0
        int j = height.length -1; //8 
        int tempArea = 0;
        
        //while 1 < 9
        while(i<j){
            int width = j - i; //width = 8 
            int h = (height[i] > height[j]) ? height[j] : height[i]; //maxHeight is lower num
            
            if(width*h > tempArea){
                tempArea = width*h;
            }
            //iterations
            if(height[i] > height[j])
                j--; 
            else
                i++;//if left < right -> left++;
        }
        return tempArea;
    }
    
    public static void main(String[] args){
      int[] a = {1,8,6,2,5,4,8,3,7};
      System.out.println(maxArea(a));
      
      List<String> list = Arrays.asList("1","3");
    }
}