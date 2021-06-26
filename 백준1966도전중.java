import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
     public static void main(String []args)throws java.lang.Exception{
        int N, M;
        int count = 1;
        Queue<Integer> q = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for(int i=0;i<testCase;i++){
            st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine(), " ");
            
            
            for(int j=0;j<N;j++){
                q.offer(Integer.parseInt(st.nextToken()));
            }
            
        }
     }
}
