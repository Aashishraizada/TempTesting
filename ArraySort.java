
import java.util.Scanner;
import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int type, length;
		
		System.out.print("Choose from the data types below\nEnter 1 for String\nEnter 2 for Integer\nSelect a data type: ");
		Scanner in = new Scanner(System.in);
		type = in.nextInt();
		while(type != 1 && type != 2) {
			System.out.print("Invalid input. Please try again: ");
			type = in.nextInt();
		}
		
		System.out.print("Enter the number of elements (maximum 20): ");
		length = in.nextInt();
		while(length < 0 || length > 20) {
			System.out.println("Invalid input. Please try again; ");
			length = in.nextInt();
		}
		
		System.out.print("Enter the elements: ");
		if(type == 1) {
			String list[] = new String[length];
			for(int i = 0; i < length; i++) {
				list[i] = in.next();
			}
			//sort the list
			String[] sortedList = sortStringArray(list);
			printSortedStringArray(sortedList);
			if(testStringSort()) {
				System.out.println("String Sort test successful!");
			}
			else {
				System.out.println("String Sort test failed!");
			}
		}
		else if(type == 2) {
			int list[] = new int[length];
			for(int i = 0; i < length; i++) {
				list[i] = in.nextInt();
			}
			//sort the list
			int[] sortedList = sortIntArray(list);
			printSortedIntArray(sortedList);
			if(testIntSort()) {
				System.out.println("Integer Sort test successful!");
			}
			else {
				System.out.println("Integer Sort test failed!");
			}
		}
		
		in.close();
	}
	

	public static int[] sortIntArray(int[] list) {
		int[] sortedList = Arrays.copyOf(list, list.length);
		Arrays.sort(sortedList);
		return sortedList;
	}

	public static String[] sortStringArray(String[] list) {
		String[] sortedList = Arrays.copyOf(list, list.length);
		Arrays.sort(sortedList);
		return sortedList;
	}

	
	public static void printSortedIntArray(int[] sortedList) {
		System.out.print("The sorted list: ");
		for(int i = 0; i < sortedList.length; i++) {
			System.out.print(sortedList[i] + " ");
		}
		System.out.println();
	}

	public static void printSortedStringArray(String[] sortedList) {
		System.out.print("The sorted list: ");
		for(int i = 0; i < sortedList.length; i++) {
			System.out.print(sortedList[i] + " ");
		}
		System.out.println();
	}
		
	
	public static boolean testIntSort() {
		int[] givenList = {5, 9, 4, 5, 8};
		int[] expectedList = {4, 5, 5, 8, 9};
		int[] resultList = sortIntArray(givenList);
		return Arrays.equals(expectedList, resultList);
	}
	public static boolean testStringSort() {
		String[] givenList = {"f", "fsh", "asa", "aav", "cla"};
		String[] expectedList = {"aav", "asa", "cla", "f", "fsh"};
		String[] resultList = sortStringArray(givenList);
		return Arrays.equals(expectedList, resultList);
	}		

}
