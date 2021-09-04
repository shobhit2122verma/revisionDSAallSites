package Recursion;

public class firstIndexOfanArrayRecursion {

	public static int firstIndex(int input[], int x) {
		return helper(input,x,0);
	}
    public static int helper(int input[],int x,int i){
        if(i>=input.length){
            return -1;
        }
        if(input[i]==x){
            return i;
        }
        return helper(input,x,i+1);
    }
}
