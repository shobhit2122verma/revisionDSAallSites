package Recursion;
// so basically we have to do it in recursion
//now we do not want to traverse from the last index
//the idea we have learnt here is we will be checking for the rest of the array that if an element is present then we simply return it
//else what if the element is not present in the smaller array
//then we come and check at the 0th index that if our array is having that element or not
//so like this what we see is that we 
public class LastIndexOfAnElementInAnArray {

	public static int lastIndex(int input[], int x) {
		return helper(input,x,0);
	}
    public static int helper(int input[],int x,int i){
        if(i>=input.length){
            return -1;
        }
        int ans=helper(input,x,i+1);
        if(ans==-1){
            if(input[i]==x){
                return i;
            }
            return -1;
        }
        return ans;
    }
}
// here what we do is we take the recursion first and then check for the cases through which we can see it is a kind of dfs search for the index
