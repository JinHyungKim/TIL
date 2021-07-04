/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int result = 1;
	    int printResult = 1;
	    boolean findResult = false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Integer[] array = new Integer[N];
		for(int i=0;i<N;i++)
		    array[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(array, Collections.reverseOrder());
        
        while(!findResult){
            for(int i=0;i<N;i++){
                if(result == array[i]){
                    result -= array[i];
                    break;
                }
                else if(result>array[i])
                    result -= array[i];
            }
            if(result != 0)
                findResult = true;
            printResult++;
            result = printResult;
        }
        System.out.println(--printResult);
	}
}
