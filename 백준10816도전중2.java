/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    static int binSearch(int[] arr, int val, int srt, int end){
        boolean isItSearched = false;
        if(srt > end)
            return -1;
        
        int mid = (srt + end)/2;
        
        if(arr[mid]<val)
            return binSearch(arr, val, mid+1, end);
        else if(arr[mid]>val)
            return binSearch(arr, val, srt, mid-1);
        else if(arr[mid]==val)
            return mid;
        else
            return -1;
    }
    
    static int solved(int[] arr, int val){
        int result = 0;
        int searchingIdx = binSearch(arr, val, 0, arr.length-1);
        if(searchingIdx == -1)
            return 0;
        
        else{
            for(int i=searchingIdx;i>-1;i--){
                if(arr[i]==arr[searchingIdx])
                    result++;
                else
                    break;
            }
            
            for(int i=searchingIdx+1;i<arr.length;i++){
                if(arr[i]==arr[searchingIdx])
                    result++;
                else
                    break;
            }
        }
        return result;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] srcArr = new int[N];
		
		for(int i=0;i<N;i++)
		    srcArr[i] = Integer.parseInt(st.nextToken());
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		int[] destArr = new int[M];
		for(int i=0;i<M;i++)
		    destArr[i] = Integer.parseInt(st.nextToken());
		Integer temp[] = Arrays.stream(srcArr).boxed().toArray(Integer[]::new);
		
		ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(temp));
		Collections.sort(lst);
		temp = lst.toArray(new Integer[lst.size()]);
		//Arrays.sort(srcArr);
		srcArr = Arrays.stream(temp).mapToInt(i->i).toArray();
		
		for(int i=0;i<destArr.length;i++){
		    sb.append(solved(srcArr, destArr[i]));
		    sb.append(" ");
		}
		System.out.println(sb.toString());
	}
}
