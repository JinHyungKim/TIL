import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		int X = Integer.parseInt(br.readLine());
		System.out.println(X);
		System.out.println("====START====");
		while(X!=1){
		    
		    if(X%3 == 0){
		        X/=3;
		        count++;
		        System.out.println(X);
		    }
		    if(X<100){
		        if((X-1)%3 == 0){
		            X/=3;
		            count+=2;
		            System.out.println(X);
		        }
		        else if(X%2 == 0){
    		        X/=2;
    		        count++;
    		        System.out.println(X);
    		    }
    		    else if((X-1)%2 == 0){
    		        X/=2;
    		        count+=2;
    		        System.out.println(X);
    		    }
		    }
		    else{
    		    if(X%2 == 0){
    		        X/=2;
    		        count++;
    		        System.out.println(X);
    		    }
    		    else if((X-1)%3 == 0){
    		        X/=3;
    		        count+=2;
    		        System.out.println(X);
    		    }
    		    else if((X-1)%2 == 0){
    		        X/=2;
    		        count+=2;
    		        System.out.println(X);
    		    }
		    }
		    System.out.println(count);
		    System.out.println("=================");
		}
	    System.out.println(count);
	}
}
