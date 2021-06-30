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
	   
	   int count = 9;
	   HashMap<Character, Integer> map = new HashMap<>();
	   Character[][] mainArray = new Character[N][8];
	    
	   for(int i=0;i<N;i++){
	        mainArray[i] = Character(Character.forDigit(br.read(), 10));
	   }
	    
	    for(int j=0;j<8;j++){
	        for(int i=0;i<N;i++){
	            if(mainArray[i][j]!='0'){
	                if(map.containsKey(mainArray[i][j])){
	                    mainArray[i][j] = Character.forDigit(map.get(mainArray[i][j]), 10);
	                }
	                else{
	                    map.put(mainArray[i][j], count--);
	                }
	            }
	        }
	    }
	    for(int i=0;i<10;i++){
	            System.out.println(Arrays.deepToString(mainArray[i]));
	    }
	}
}
