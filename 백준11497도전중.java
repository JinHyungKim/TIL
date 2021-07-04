/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    while(T-->0){
	        int level;
	        int N = Integer.parseInt(br.readLine());
	        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	        int arr[] = new int[N];
	        int arr2[] = new int[N];
	        for(int i=0;i<N;i++)
	            arr[i] = Integer.parseInt(st.nextToken());
	        Arrays.sort(arr);
	        
	        for(int i=0;i<N;i++){
	            if(i<=(N/2)+1)
	                arr2[i] = arr[i*2];
	            else{
	                for(int j=0;j<N/2;j++)
	                    arr2[i] = arr[j*2+1];
	            }
	        }
	        for (int i : arr2) {
            System.out.print("["+i+"]");
	    }
    }
}
