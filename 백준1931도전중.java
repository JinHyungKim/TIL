/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Meeting implements Comparable<Meeting>{
	int startingTime;
	int endingTime;
	int meetingTime;
	public Meeting(int s, int e){
		startingTime = s;
		endingTime = e;
		meetingTime = e-s;
	}
	@Override
	public int compareTo(Meeting m){
		return m.endingTime - endingTime;
	}
	public String toString(){
		return "s: "+startingTime+" e: "+endingTime+" m: "+meetingTime;
	}

}
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int N;
		int sTime;
		int mTime;
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(bf.readLine());
		Meeting[] meet = new Meeting[N];
		for(int i=0;i<N;i++){
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			meet[i] = new Meeting(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		Collections.sort(meet);
		for(Meeting e:meet)
			System.out.println(e.toString());
		
	}
}
