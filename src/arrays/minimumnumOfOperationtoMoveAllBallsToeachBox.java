package arrays;

public class minimumnumOfOperationtoMoveAllBallsToeachBox {
	public int[] minOperations(String boxes) {
        int ans[]=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            int count=0;
            int last=boxes.length()-1;
            int start=0;
            while(last>i){
                if(boxes.charAt(last)=='1'){
                    count=count+Math.abs(last-i);
                }
                last--;
            }
            while(start<i){
                if(boxes.charAt(start)=='1'){
                    count=count+Math.abs(start-i);
                }
                start++;
            }
            ans[i]=count;
        }
        return ans;
    }
    //O(n) solution
    // int right=0;
    //     int step=0;
    //     int n=boxes.length();
    //     char nums[]=boxes.toCharArray();
    //     for(int i=0;i<n;i++){
    //         if(nums[i]=='1'){
    //             step=step+i;
    //             right++;
    //         }
    //     }
    //     int res[]=new int[n];
    //     int left=0;
    //     for(int i=0;i<n;i++){
    //         res[i]=step;
    //         if(nums[i]=='1'){
    //             right--;
    //             left++;
    //         }
    //         step=step-right;
    //         step=step+left;
    //     }
    //     return res;
}
