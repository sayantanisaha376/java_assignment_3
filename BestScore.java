package com.example;


class BestScore {

	    public static int[] firstSecond(int[] myArray) {
	        
	        if (myArray.length < 2) {
	            return new int[]{};
	        }

	        // Initialize variables for first and second highest scores as null
	        Integer first = null;
	        Integer second = null;

	        // Loop through the array to find the first and second best scores
	        for (int score : myArray) {
	            // Update the first and second scores based on current score
	            if (first == null || score > first) {
	                second = first;  
	                first = score;   
	            } else if (second == null || (score > second && score < first)) {
	                second = score;  
	            }
	        }

	        // If no valid second highest is found, return just the first best score 
	        if (second == null) {
	            return new int[]{first};
	        }

	        return new int[]{first, second};
	    }

	    public static void main(String[] args) {
	        int[] myArray = {84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0};
	        int[] result = firstSecond(myArray);

	        // Print the result
	        System.out.println(result[0] + " and " + result[1]);  // Output: 90, 87
	    }
	}


