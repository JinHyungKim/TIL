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
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");;
	    
	    int srt = Integer.parseInt(st.nextToken());
	    int end = Integer.parseInt(st.nextToken());
	    
	    int[] arr = new int[end+1];
	    
	    for(int i = 2;i<=end;i++)
	        arr[i] = i;    
	    System.out.println(Arrays.toString(arr));
	    
	    for(int i = 2;i<=end;i++){
	        if(arr[i]!=0){
	            bw.write(String.valueOf(i));
	            bw.newLine();
	            for(int j=i+1;j<=end;j++){
	                if(arr[j]%i==0)
	                    arr[j] = 0;
	            }
	        }
	    }
	    bw.flush();
	    bw.close();
	}
}
