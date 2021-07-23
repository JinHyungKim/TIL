/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int result = 0;
	    boolean check = true;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		
		for(int i=0;i<N;i++)
		    arr[i] = br.readLine();
		String[] cloneArr = Arrays.copyOf(arr, N);
		for(int i=0;i<N;i++){
		    
		    for(int j=0;j<arr[i].length();j++){
		        
		        for(int k=j+1;k<cloneArr[i].length();k++){
		            //System.out.println(k);
		            //System.out.println(cloneArr[i].length());
		            //System.out.println((char)cloneArr[i].charAt(k));
		            //System.out.println("=====");
		            System.out.println(check);
		            if(cloneArr[i].charAt(k) == arr[i].charAt(j))
		                check = false;
		        }
		    }
		    if(check)
		        result++;
		}
		System.out.println(result);
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(cloneArr));
	}
}
