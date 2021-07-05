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
	        int j=1;
	        int N = Integer.parseInt(br.readLine());
	        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	        int arr[] = new int[N];
	        int arr2[] = new int[N];
	        for(int i=0;i<N;i++)
	            arr[i] = Integer.parseInt(st.nextToken());
	        Arrays.sort(arr);

            if(N%2!=0){
    	        for(int i=0;i<N;i++){
    	            if(i<=N/2){
    	                arr2[i] = arr[i*2];
    	            }
    	            
    	            else{
    	                arr2[i] = arr[N-j*2];
    	                j++;
    	            }
    	        }
            }
            else{
                for(int i=0;i<N;i++){
    	            if(i<N/2){
    	                arr2[i] = arr[i*2];
    	            }
    	            
    	            else{
    	                arr2[i] = arr[(N-j*2)+1];
    	                j++;
    	            }
    	        }
            }
	       // for (int i : arr2) 
        //         System.out.print("["+i+"]");
        //     System.out.println();
            level = arr2[1] - arr2[0];
            for(int i=1;i<N-1;i++)
                if(arr2[i+1]-arr2[i] > level)
                    level = arr2[i+1]-arr2[i];
            if(arr2[N-1]-arr2[0]>level)
                level = arr2[N-1]-arr2[0];
            System.out.println(level);
        }
    }
}
