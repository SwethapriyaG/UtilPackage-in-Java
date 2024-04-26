//program to demonstrate arrays in java.util

import java.util.*;

class ArrayEx
{
	public static void main(String ar[])
	{
		
		int marks[] = {45,34,56,22,15,36,76};
		int marks2[] = {45,34,56,22,15,36,76};
		int marks3[] = {45,34,56,22,15,36,76};
		
		System.out.println("befor sorting");
		
		for(int i=0;i<marks.length;i++)
			System.out.print(marks[i]+ "\t");
		
		Arrays.sort(marks,3,7);
		
		System.out.println("\nafter sorting");
		
		for(int i=0;i<marks.length;i++)
			System.out.print(marks[i]+ "\t");
		
		System.out.println();
		 System.out.println("searching for 22: " + Arrays.binarySearch(marks, 22));
		 System.out.println("searching for 12: " + Arrays.binarySearch(marks, 12));
		System.out.println("marks3==marks2: "+Arrays.equals(marks3,marks2));
	}	
	
}	