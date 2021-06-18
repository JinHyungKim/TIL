/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] intArray = new int[N];
		for(int i=0;i<N;i++){
			intArray[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0;i<N;i++){
			System.out.println(intArray[i]);// = Integer.parseInt(br.readLine());
		}
	}
}
