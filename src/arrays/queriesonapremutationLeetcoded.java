package arrays;

public class queriesonapremutationLeetcoded {

	public int[] processQueries(int[] queries, int m) {
        int a[]=new int[m];
        for(int i=0;i<m;i++){
            a[i]=i+1;
        }
        for(int i=0;i<queries.length;i++){
            int find=queries[i];
            int index=0;
            for(int j=0;j<a.length;j++){
                if(a[j]==find){
                    index=j;
                    break;
                }
            }
            queries[i]=index;
            int temp=a[index];
            while(index>0){
                a[index]=a[index-1];
                index--;
            }
            a[0]=temp;
        }
        return queries;
    }
}
