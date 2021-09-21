package arrays;

public class subrectanglequeriesleetcode {

	public int rectangle[][];
    public subrectanglequeriesleetcode(int[][] rectangle) {
        this.rectangle=rectangle;
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        int rsi=row1;
        int csi=col1;
        int rei=row2;
        int cei=col2;
        for(int i=csi;i<=cei;i++){
            for(int j=rsi;j<=rei;j++){
                rectangle[j][i]=newValue;
            }
        }
    }
    
    public int getValue(int row, int col) {
        if((row<rectangle.length&&row>=0)&&(col<rectangle[0].length&&col>=0)){
            return rectangle[row][col];
        }
        return -1;
    }
}
