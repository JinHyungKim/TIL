import java.util.Scanner;
import java.util.Stack;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException, NullPointerException{
			
				BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
				Scanner s = new Scanner(System.in);
				
				int N = s.nextInt();	
				int i=0;
				int value;
				int size=0;
				Stack<Integer> stk = new Stack<>(N);
				
				while(i<N){
					String cmd = sc.readLine();
					String cmdCpy = new String(cmd);
					cmd = cmd.replaceAll("[0-9]", "");
					cmd = cmd.replaceAll(" ", "");
					//System.out.println(cmd);
					//System.out.println(cmdCpy);
					switch(cmd){
						case "push":
							value =Integer.parseInt(cmdCpy.replaceAll("[^0-9]", ""));
					//		System.out.println(value);
							stk.push(value);
							size++;
							break;
						case "pop":
							if(stk.empty())
								System.out.println(-1);
							else{
								System.out.println(stk.pop());
								size--;
							}
							break;
						case "size":
							System.out.println(size);
							break;
						case "empty":
							if(!stk.empty())
								System.out.println(0);
							else
								System.out.println(1);
							break;
						case "top":
							if(!stk.empty())
								System.out.println(stk.peek());
							else
								System.out.println(-1);
							break;	
					}
					i++;
				}
				sc.close();
	}
}
