/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    String str;
	    int result = 0;
	    int asciiArrayIndex = 0;
	    int count = 9;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb;
	    int N = Integer.parseInt(br.readLine());
	    Map<Character, Integer> map = new HashMap<>();
	    char[][] mainArray = new char[N][8];
	    int[][] asciiArray = new int[10][2];
	    
	    for(int j=0;j<N;j++){
	        str = br.readLine();
	        for(int i=0;i<8;i++){
	            for(;i<8-str.length();i++)
	                mainArray[j][i] = 32;
	            mainArray[j][i] = str.charAt(i-(8-str.length()));
	        }
	    }
	    for(int j=0;j<8;j++){
	        for(int currentIndex = 0;currentIndex<N;currentIndex++){
    	        if(mainArray[currentIndex][j] != 32){
    	            if(!map.containsKey(mainArray[currentIndex][j]))
    	                map.put(mainArray[currentIndex][j], count--);
    	        }
	        }
	    }
	    
	    for(int i=0;i<N;i++){
	        sb = new StringBuilder();
	        for(int j=0;j<8;j++){
	            if(map.containsKey(mainArray[i][j]))
	                sb.append(map.get(mainArray[i][j]));
	        }
	        System.out.println(sb.toString());
	        result += Integer.parseInt(sb.toString());
	    }
	    
	    System.out.println(result);
	   // System.out.println(map);
	   // for(char[] c:mainArray)
	   //     System.out.println(c);
	}
}
