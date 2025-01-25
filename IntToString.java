package com.example;

class IntToString {
		 static int[] arr= {10,20,30,40,50};
		 static String[] stringArray=new String[arr.length];
		 public static void main(String[]args) {
			 String[] result=convert(arr);
			 display(result);
		 }
	static String[] convert(int[]arr) {
		for (int i=0;i<arr.length;i++) {
			stringArray[i]=String.valueOf(arr[i]);
			
		}
		return stringArray;
	}
	static void display(String[]args) {
		for(String x:args) {
			System.out.println(" . "+x);
		}
	}
}


