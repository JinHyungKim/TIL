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
	    int N = Integer.parseInt(br.readLine());
	    int result = 0;
	    boolean isItGroupWord = true;
	    while(N-->0){
	        boolean[] arr = new boolean[26]; 
	        String S = br.readLine();
	        for(int i=0;i<S.length()-1;i++){
	            if(S.charAt(i) == S.charAt(i+1))
	                continue;
	            else{
	                if(arr[(int)S.charAt(i)-97]){
	                    isItGroupWord = false;
	                    break;
	                }
	                else{
	                    arr[(int)S.charAt(i)-97] = true;
	                }
	            }
	        }
	        if(isItGroupWord)
	            result++;
	    }
	    System.out.println(result);
	}
}
