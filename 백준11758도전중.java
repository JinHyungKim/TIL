/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Pos{
    private int x;
    private int y;
    
    public Pos(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    @Override
    public String toString(){
        return x + " " +y;
    }
}
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int i = 0;
	    int N = 3;
	    int horizonal;
	    int vertical;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st;
	    Pos[] arr = new Pos[3];
	    while(N-->0){
	        st = new StringTokenizer(br.readLine(), " ");
	        arr[i] = new Pos(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())); 
	        i++;
	    }
	    System.out.println(Arrays.toString(arr));
	    horizonal = arr[2].getX() - arr[0].getX();
	    vertical = arr[1].getY() - arr[0].getY();
	    if((horizonal > 0 && vertical > 0)||(horizonal < 0 && vertical < 0))
	        System.out.println(-1);
	    else if((horizonal > 0 && vertical < 0)||(horizonal < 0 && vertical > 0))
	        System.out.println(1);
	    else if(horizonal == 0||vertical == 0)
	        System.out.println(0);
	}
}
