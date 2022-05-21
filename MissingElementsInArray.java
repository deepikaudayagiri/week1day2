package week1Day2;
import java.util.Arrays;
public class MissingElementsInArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		int j = 0;
		Arrays.sort(arr);
		
		for (int i = arr[0]; i < arr.length - 1; i++) {
			
			if (i != arr[j]) 
			{
				System.out.println(i);
				break;
			}
			j++;
		}
	}

}
