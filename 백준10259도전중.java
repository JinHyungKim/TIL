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
		StringTokenizer st;
		int H, W, N;
		int floor;
		int number;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
		    st = new StringTokenizer(br.readLine(), " ");
		    H = Integer.parseInt(st.nextToken());
		    W = Integer.parseInt(st.nextToken());
		    N = Integer.parseInt(st.nextToken());
		    
		    floor = N%H;
		    number = N/H + 1;
		    sb.append(String.valueOf(floor));
		    if(number < 10)
		        sb.append("0");
		    sb.append(String.valueOf(number));
		    System.out.println(sb.toString());
		    sb.setLength(0);
		}
		
	}
}
