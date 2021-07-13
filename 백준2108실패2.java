/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    static int retArithmeticMean(int[] arr){
        float val;
        int sum=0;
        for(int i=0;i<arr.length;i++)
            sum += arr[i];
        val = sum/(float)arr.length;
        return Math.round(val);
    }
    
    static int retMedianValue(int[] arr){
        return arr[arr.length/2];
    }
    
    static int retMode(int[] arr){
        if(arr.length == 1)
            return arr[0];
        boolean isItSecondVal = false;
        int ret=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int val = 1;
        for(int i=0;i<arr.length-2;i++){
            while(arr[i] == arr[i+1]){
                val++;
                i++;
            }
            if(val!=1)
                map.put(arr[i], val);
            val = 1;
        }
        List<Integer> keyList = new ArrayList<>(map.keySet());
        if(map.isEmpty())
            return arr[1];
        int maxModeVal = map.get(keyList.get(0));
        for(int i=1;i<keyList.size();i++){
            if(maxModeVal<map.get(keyList.get(i)))
                ret = keyList.get(i);
            else if(maxModeVal==map.get(keyList.get(i))){
                if(!isItSecondVal){
                    ret = keyList.get(i);
                    isItSecondVal = true;
                }
            }
        }
        return ret;
    }
    
    static int retRange(int[] arr){
        return arr[arr.length-1] - arr[0];
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		int arithmeticMean;
		int medianValue;
		int mode;
		int range;
		int[] array = new int[N];
		
		for(int i=0;i<N;i++)
		    array[i] = Integer.parseInt(br.readLine());
	    
	    Arrays.sort(array);
	    arithmeticMean = retArithmeticMean(array);
	    medianValue = retMedianValue(array);
	    mode = retMode(array);
	    range = retRange(array);
	    
		bw.write(String.valueOf(arithmeticMean));
		bw.newLine();
		bw.write(String.valueOf(medianValue));
		bw.newLine();
		bw.write(String.valueOf(mode));
		bw.newLine();
		bw.write(String.valueOf(range));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
