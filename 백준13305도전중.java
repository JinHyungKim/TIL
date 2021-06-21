/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int N;
		int totalPrice = 0;
		int mostCheapestCityIndex =0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int[] distanceOfCity = new int[N-1];
		int[] oilPriceOfCity = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;st.hasMoreTokens();i++)
			distanceOfCity[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;st.hasMoreTokens();i++)
			oilPriceOfCity[i] = Integer.parseInt(st.nextToken());
			
		for(int curIndex = 0;curIndex<N-1;curIndex++){	//curIndex는 도시의미
			if(curIndex==0)
				totalPrice += oilPriceOfCity[mostCheapestCityIndex]*distanceOfCity[mostCheapestCityIndex];
			else{
				if(oilPriceOfCity[mostCheapestCityIndex]<oilPriceOfCity[curIndex]){
					totalPrice += oilPriceOfCity[mostCheapestCityIndex]*distanceOfCity[curIndex];
				}
				else{
					mostCheapestCityIndex = curIndex;
					totalPrice += oilPriceOfCity[mostCheapestCityIndex]*distanceOfCity[curIndex];
				}
			}
		}
		System.out.println(totalPrice);
	}
}
