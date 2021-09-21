package arrays;
import java.util.*;
public class minCountoFbALLiNabAG {

	public static int minCountOfBallsInBag(ArrayList<Integer> arr, int n, int m) {
        while(m!=0){
            arr.sort(null);
            for(int i : arr) {
            	System.out.print(i+" ");
            }
            System.out.println();
            int a=arr.get(arr.size()-1);
            int a1=a/2;
            int a2=a-a1;
            arr.remove(arr.size()-1);
            arr.add(a1);
            arr.add(a2);
            m--;
        }
        return arr.get(arr.size()-1);
    }
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<>();
		int n=in.nextInt();
		int m=in.nextInt();
		for(int i=0;i<n;i++) {
			arr.add(in.nextInt());
		}
		System.out.println(minCountOfBallsInBag(arr, n, m));
	}
}
