package arrays;

public class queriesOnNumberOfPointsInCircle {

	 public int[] countPoints(int[][] points, int[][] queries) {
	        int ans[]=new int[queries.length];
	        for(int i=0;i<queries.length;i++){
	            int x=queries[i][0];
	            int y=queries[i][1];
	            int r=queries[i][2];
	            int cnt=0;
	            for(int j=0;j<points.length;j++){
	                int x1=points[j][0];
	                int y1=points[j][1];
	                if(checkIncircle(x,y,x1,y1,r)){
	                    cnt++;
	                }
	            }
	            ans[i]=cnt;
	        }
	        return ans;
	    }
	    public static boolean checkIncircle(int x,int y,int a,int b,int r){
	        int dx=Math.abs(x-a);
	        int dy=Math.abs(y-b);
	        if(dx+dy<=r){
	            return true;
	        }
	        int res=(int)(Math.pow(dx,2)+Math.pow(dy,2));
	        if(res<=(r*r)){
	            return true;
	        }
	        return false;
	    }
}
