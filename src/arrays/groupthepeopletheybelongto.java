package arrays;
import java.util.*;
public class groupthepeopletheybelongto {

	public static ArrayList<ArrayList<Integer>> groupThePeople(int[] arr) {
        int a[]=new int[arr.length+1];
        HashMap<Integer,ArrayList<ArrayList<Integer>>> map=new HashMap<>();
        int l=arr.length;
        for(int i=0;i<l;i++) {
        	if(map.containsKey(arr[i])) {
        		ArrayList<ArrayList<Integer>> ar=map.get(arr[i]);
        		ArrayList<Integer> ar1=ar.get(ar.size()-1);
        		if(ar1.size()%arr[i]!=0) {
        			ar1.add(i);
        			ar.set(ar.size()-1, ar1);
        			map.put(arr[i], ar);
        		}
        		else
        		{
        			ArrayList<Integer> array=new ArrayList<>();
        			array.add(i);
        			ar.add(array);
        			map.put(arr[i], ar);
        		}
        	}
        	else
        	{
        		ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
        		ArrayList<Integer> ar1=new ArrayList<>();
        		ar1.add(i);
        		ar.add(ar1);
        		map.put(arr[i], ar);
        	}
        }
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Set<Integer> set=map.keySet();
        for(int i:set) {
        	ArrayList<ArrayList<Integer>> array=map.get(i);
        	for(int j=0;j<array.size();j++) {
        		ArrayList<Integer> ar=array.get(j);
        		ans.add(ar);
        	}
        }
        return ans;
    }
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		ArrayList<ArrayList<Integer>> ans=groupThePeople(a);
		
	}
}
