package day2homeassignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int length=arr.length;
		for (int i=0; i<length; i++)
		{
			int j=arr[i];

			if ((i+1)!=j)
			{
				System.out.println(i+1);
				break;
			}
		}
	}
}


