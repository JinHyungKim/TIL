/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    // static void reverse(int[] arr){
    //     int[] cpArr = new int[arr.length];
    //     for(int i=0;i<arr.length;i++)
    //         cpArr[i] = arr[i];
    //     for(int i=0;i<arr.length;i++)
    //         arr[i] = cpArr[arr.length-1-i];
    // }
    // static int[] delete(int[] arr){
    //     int[] newArr = new int[arr.length-1];
    //     for(int i=0;i<arr.length-1;i++)
    //         newArr[i] = arr[i+1];
    //     return newArr;
    // }
	public static void main (String[] args) throws java.lang.Exception
	{
	    boolean isItNotError = true;
	    StringBuilder sb = new StringBuilder();
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st;
	    int T = Integer.parseInt(br.readLine());
	    
	    while(T-->0){
	        isItNotError = true;
	        String P = br.readLine();
	        P = P.replace("RR", "");
	        int N = Integer.parseInt(br.readLine());
	        String rawArray = br.readLine();
	        rawArray = rawArray.replace("[", "");
	        rawArray = rawArray.replace("]", "");
	        st = new StringTokenizer(rawArray, ",");
	        int[] arr = new int[N];
	        for(int i=0;i<N;i++)
	            arr[i] = Integer.parseInt(st.nextToken());
	        
	        for(int i=0;i<P.length();i++){
	            switch(P.charAt(i)){
	                case 'R':
	                    int[] cpArr = new int[arr.length];
                        for(int j=0;j<arr.length;j++)
                            cpArr[j] = arr[j];
                        for(int j=0;j<arr.length;j++)
                            arr[j] = cpArr[arr.length-1-j];
	                    break;
	                case 'D':
	                    if(arr.length==0){
	                        sb.append("error");
	                        sb.append(System.lineSeparator()); 
	                        isItNotError = false;
	                        break;
	                    }
	                    else{
	                        int[] newArr = new int[arr.length-1];
                            for(int j=0;j<arr.length-1;j++)
                                newArr[j] = arr[j+1];
                            arr = newArr;
	                    }
	            }
	        }
	        if(isItNotError){
	            sb.append(Arrays.toString(arr));
	            sb.append(System.lineSeparator()); 
	        }
	    }
	    System.out.println(sb.toString());
	}
}
