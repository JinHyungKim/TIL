/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 1;
		String curMin = " ";
		String FString = " ";
		String BString = " ";
        String FStringB = " ";
        int F = 1;
        int B = 0;
		while(cnt<N){
		    FString = String.valueOf(F).concat("666");
		    BString = "666".concat(String.valueOf(B));
		    FStringB = String.valueOf(F).concat("666").concat(String.valueOf(B));
		   
		    if(Integer.parseInt(FString)>=Integer.parseInt(BString)){
		        if(Integer.parseInt(FStringB)>Integer.parseInt(BString)){
		            curMin = BString;
		            B++;
		        }
		        else{
		            curMin = FStringB;
		            F++;
		            B++;
		        }
		    }
		    else if(Integer.parseInt(FString)<Integer.parseInt(BString)){
		        if(Integer.parseInt(FString)>Integer.parseInt(FStringB)){
		            curMin = FStringB;
		            F++;
		            B++;
		        }
		        else{
		            curMin = FString;
		            F++;
		        }
		    }
		    else if(Integer.parseInt(FString)>=Integer.parseInt(FStringB)){
		        if(Integer.parseInt(FStringB)>Integer.parseInt(BString)){
		            curMin = BString;
		            B++;
		        }
		        else{
		            curMin = FStringB;
		            F++;
		            B++;
		        }
		    }
		    else if(Integer.parseInt(FString)<Integer.parseInt(FStringB)){
		        if(Integer.parseInt(FString)<Integer.parseInt(BString)){
		            curMin = FString;
		            F++;
		        }
		        else{
		            curMin = BString;
		            B++;
		        }
		    }
		    else if(Integer.parseInt(FStringB)>=Integer.parseInt(BString)){
		        if(Integer.parseInt(FString)>Integer.parseInt(BString)){
		            curMin = BString;
		            B++;
		        }
		        else{
		            curMin = FString;
		            F++;
		        }
		    }
		    else if(Integer.parseInt(FStringB)<Integer.parseInt(BString)){
		        if(Integer.parseInt(FStringB)<Integer.parseInt(FString)){
		            curMin = FStringB;
		            F++;
		            B++;
		        }
		        else{
		            curMin = FString;
		            F++;
		        }
		    }
		    cnt++;
		}
		if(cnt == 1){
		    System.out.println(666);
		    return;
		}
		else{
		    System.out.println(curMin);
		}
	}
}
