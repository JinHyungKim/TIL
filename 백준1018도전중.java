/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    static int solved(char[][] arr, int sr, int sc){
        int result=0;
        for(int i=sr;i<8;i++){
            if(i==sr){
                for(int j=sc+1;j<8;j++){
                    if(arr[i][j] == arr[i][j-1]){
                        result++;
                        if(arr[i][j]=='W')
                            arr[i][j]='B';
                        else
                            arr[i][j]='W';
                        }
                    }
                }
            else{
                for(int j=sc;j<8;j++){
                    if(j==sc){
                        if(arr[i][j] == arr[i-1][j]){
                            result++;
                            if(arr[i][j]=='W')
                                arr[i][j]='B';
                            else
                                arr[i][j]='W';
                        }
                    }
                    else{
                        if(arr[i][j] == arr[i][j-1]){
                            result++;
                            if(arr[i][j]=='W')
                                arr[i][j]='B';
                            else
                                arr[i][j]='W';
                        }
                    }
                }
            }
        }   
        return result;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    int cnt = 0;
	    int caseWhenStartIsWhite = 0;
	    int caseWhenStartIsBlack = 0;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    int N = Integer.parseInt(st.nextToken()); //N:행
	    int M = Integer.parseInt(st.nextToken()); //M:열
	    char[][] Wchess = new char[N][M];
	    char[][] Bchess = new char[N][M];
	    
	    int[] resultArr = new int[(N-7)*(M-7)];
	    
	    for(int i=0;i<N;i++)
	        Wchess[i] = (br.readLine()).toCharArray();
	    Wchess[0][0] = 'W';
	    for(int i=0; i<N; i++)
            System.arraycopy(Wchess[i], 0, Bchess[i], 0, Wchess[0].length);
        Bchess[0][0] = 'B';
        
        for(int i=0;i<N-7;i++){
            for(int j=0;j<M-7;j++){
                resultArr[cnt] = solved(Wchess, i,j);
            }
        }
        System.out.println(Arrays.toString(resultArr));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	   // for(int i=0;i<N;i++)
	   //     System.out.println(Arrays.toString(Wchess[i]));
	   // System.out.println("============");
	   // for(int i=0;i<N;i++)
	   //     System.out.println(Arrays.toString(Bchess[i]));
	   // System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	   // System.out.println("W: "+solved(Wchess, N,M));
	   // System.out.println("B: "+solved(Bchess, N,M));
	   // for(int i=0;i<N;i++)
	   //     System.out.println(Arrays.toString(Wchess[i]));
	   // System.out.println("============");
	   // for(int i=0;i<N;i++)
	   //     System.out.println(Arrays.toString(Bchess[i]));
	   
	}
}
