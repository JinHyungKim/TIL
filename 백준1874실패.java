/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] intArray = new int[N];
		Stack<Integer> stk = new Stack<>();
		Stack<Integer> resultStk = new Stack<>();
		int currentIdx=0;
		int resultIdx=0;
		char[] resultArray = new char[200000];
		for(int i=0;i<N;i++){
			intArray[i] = Integer.parseInt(br.readLine());
			stk.push(N-i);
		}
		int i=0;
		while(!stk.empty()){
			int searchingNum = intArray[i];
			if(i!=0&&searchingNum == intArray[i-1]-1){
				resultStk.pop();
				resultArray[resultIdx++] = '-';
				resultArray[resultIdx++] = '\n';
				//bw.write("-\n");
			}
			else if(i==0||searchingNum>intArray[i-1]){
				while(!((stk.peek()).intValue()==searchingNum)){
					resultStk.push(stk.pop());
					resultArray[resultIdx++] = '+';
					resultArray[resultIdx++] = '\n';
					//bw.write("+\n");
				}
				resultStk.push(stk.pop());
				resultArray[resultIdx++] = '+';
				resultArray[resultIdx++] = '\n';
				//bw.write("+\n");
				
				resultStk.pop();
				resultArray[resultIdx++] = '-';
				resultArray[resultIdx++] = '\n';
				//bw.write("-\n");
			}
			else{
				System.out.println("NO");
				bw.close();
				return;
			}
			//System.out.println(i);
			i++;
			currentIdx = i;
		}
	
		while(!resultStk.empty()){
			if((resultStk.peek()).intValue()==intArray[currentIdx]){
				resultArray[resultIdx++] = '-';
				resultArray[resultIdx++] = '\n';
				//bw.write("-\n");
				resultStk.pop();
			}
			else{
				System.out.println("NO");
				bw.close();
				return;
			}
			currentIdx++;
		}
		bw.write(resultArray, 0, resultArray.length);
		bw.flush();   
		bw.close();
	}
}
