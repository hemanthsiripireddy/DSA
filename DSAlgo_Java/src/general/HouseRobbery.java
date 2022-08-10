package general;

public class HouseRobbery {
	private int[][] db;
	   public int rob(int[] nums) {
	       db=new int[2][nums.length];
	     
	       for(int i=0;i<2;i++){
	           for(int j=0;j<nums.length;j++){
	               db[i][j]=-1;
	           }
	       
	           
	       }
	       return f1(0,1,nums);
	   }
	       public int f1(int i,int canRob,int[] nums){
	           if(i==nums.length-1){//if it is last numberr
	               if(canRob==1)
	                   return nums[i];
	               else
	                   return 0;
	           }
	           else {
	        	   if(db[canRob][i]!=-1)
	                   return db[canRob][i];
	           if(canRob==1){
	               db[canRob][i]= Math.max(nums[i]+f1(i+1,0,nums),f1(i+1,1,nums));//find  max of (robbing ith, of robbing ith+1)
	           }
	           else {
	        	   db[canRob][i]= f1(i+1,1,nums);
	           }
	               return db[canRob][i];
	        	   
	           }
	           
	              
	       }
	       

}
