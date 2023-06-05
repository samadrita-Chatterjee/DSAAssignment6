package in.ineron.comp;


import java.io.*;
import java.lang.*;
import java.util.*;

class MountainArray {


static Boolean isMountainArray(int arr[])
{
	if (arr.length < 3)
		return false;
	int flag = 0, i = 0;
	for (i = 1; i < arr.length; i++)
		if (arr[i] <= arr[i - 1])
			break;

	if (i == arr.length || i == 1)
		return false;

	for (; i < arr.length; i++)
		if (arr[i] >= arr[i - 1])
			break;
	return i == arr.length;
}

//Driver Code
	public static void main (String[] args) {
		int arr[] = { 1, 2, 3, 4, 9,
			8, 7, 6, 5 };
	System.out.println(isMountainArray(arr)
				? "true"
				: "false");
	
	}
}


