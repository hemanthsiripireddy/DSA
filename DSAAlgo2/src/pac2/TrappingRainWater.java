package pac2;

public class TrappingRainWater {
	public int trap(int[] height) {
        int l=0,r=height.length-1;
        int leftMax=height[0],rightMax=height[r],sum=0;
        while(l<r){
            if(leftMax<rightMax){
                l++;
                leftMax=Math.max(leftMax,height[l]);
                sum+=(leftMax-height[l]);
            }else{
                r--;
                rightMax=Math.max(rightMax,height[r]);
                sum+=(rightMax-height[r]);
            }
                      
        }
          return sum;
                      
        
    }

}
