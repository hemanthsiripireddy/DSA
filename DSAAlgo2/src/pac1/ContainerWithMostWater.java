package pac1;

public class ContainerWithMostWater {
	public int maxArea(int[] height) {
        int i=0,j=height.length-1,area=0;
        while(i<j){
            int temp=Math.min(height[i],height[j])*(j-i);
            area=Math.max(area,temp);
            if(height[i]<height[j])
                i++;
            else 
                j--;
           
            
        }
         
        return area;
        
    }

}
