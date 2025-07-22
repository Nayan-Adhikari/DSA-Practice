import java.util.* ;
import java.io.*; 
public class Solution {
	public static int[] termsOfAP(int x){
		// Write your code here.
		int []arr = new int[x];
		int i=1;
		int count=0;
		while (count<x){
			if(((3*i)+2)%4 !=0){
				arr[count] = ((3*i)+2);
				count++;
			}
			i++;
		}
		return arr;
	}
}
