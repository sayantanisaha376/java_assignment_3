package com.example;

class DoubleRevSum {

		 public static void main(String[] args) {
		        
		        double[] arr = {1.9, 2.8, 3.7, 4.6, 5.5};
		        
		        
		        reverseSumArrays(arr);
		    }
		 static void reverseSumArrays(double[] arr) {
		      
		        double[] reversedArray = new double[arr.length];  //  array to store the reversed array

		       
		        for (int i = 0; i < arr.length; i++) {
		            reversedArray[i] = arr[arr.length - 1 - i]; // Reverse the array
		        }

		        // Calculate and print the sum of both arrays' elements
		        double sum = 0;
		        
		        System.out.println("Original Array: "+" ");
		        for (double num : arr) {
		            System.out.print(num + " ");
		        }

		        System.out.println("\nReversed Array: "+ " ");
		        for (double num : reversedArray) {
		            System.out.print(num + " ");
		        }

		        // To Calculate the sum of  elements in both arrays
		        for (int i = 0; i < arr.length; i++) {
		            sum += arr[i] + reversedArray[i];
		        }

		        System.out.println("\n                       " +"\nSum of elements of two arrays is: " + sum);
		    }
		 
		 
		 
	}