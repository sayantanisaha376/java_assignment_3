package com.example;

class MidArray {
	
	public static int[]mid(int[]array){
		if (array.length<=2) {
			return new int[0];        //returns blank array as there are two elements so after removing the 1st and last it gives blank array 
		}
		
		    int[] result=new int[array.length-2];
		    for (int i = 1; i < array.length-1; i++) {
		    	result[i-1]=array[i];   
		    }
		    return result;
		}
	
	public static void printArray(int[]array) {
		for (int r : array) {
			System.out.println(r+" ");
			
		}
	}
	
	public static void main(String[]args) {
		int[]myArray= {1,2,3,4};
		int[]result=mid(myArray);
		printArray(result);
		
	}
	}

