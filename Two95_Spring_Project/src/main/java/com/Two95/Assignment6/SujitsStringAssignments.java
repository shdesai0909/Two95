/**
 * 
 */
package com.Two95.Assignment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

//import org.hamcrest.internal.ArrayIterator;

import java.util.Iterator;

/**
 * @author Sujit
 *
 */
public class SujitsStringAssignments {

	String stringToBeChecked;
	
	SujitsStringAssignments(String str) {
		this.stringToBeChecked = str;
	}
	
	public static void checkForDuplicateChars(String str){
		
		int totalNumofDuplicateChars = 0;
		boolean hasDuplicateChars = false;
		
		if(null != str){
			for(int i=0; i<str.length()-1; i++){
				System.out.println("\t Charater '" +  str.charAt(i) + "'"); 
				for(int j=i+1; j<str.length(); j++){
					System.out.println("\t\t Charater '" +  str.charAt(j) + "'"); 
					if(str.charAt(i) == str.charAt(j)){
						hasDuplicateChars = true;
						totalNumofDuplicateChars++;
						System.out.println("Charater '" +  str.charAt(i) + "' at position #" + (i+1) + " And position #" + (j+1) + " are EQUAL.");
					}

				}
			}
			if(hasDuplicateChars){
				System.out.println("There are total " +  totalNumofDuplicateChars + " Number of Duplicate Charcters in the String '" + str + "'");
			}else{
				System.out.println("There are NO Duplicate Charcters in the String '" + str + "'!!!");
			}
		}
	}
	
	public static String reverseTheString(String str){
			String reversedString = null;
			if(null != str){
				int strLength = str.length();
				//			    for (Iterator<Character> charIter = str.iterator(); str.hasNext();){
//			        System.out.println(str.next());
				char[] reversedStringArray = new char[strLength];
			    for(int i=strLength-1; i>=0; i--){
			    	reversedStringArray[i] = str.charAt(i - strLength+1);
			    	
			    }
				
			    for(int i=0; i<strLength; i++){
			    	reversedStringArray[strLength -(i+1)] = str.charAt(i);
			    	
			    }
			    reversedString = String.valueOf(reversedStringArray);
//				}
			}
			System.out.println("Reverse of The String('" + str + "' is '" + reversedString + "'");
		    return reversedString;
	}
	
	public static int numberOfVowels(String str){
		int totalNumberofVowels = 0;

		if(null != str){
//			ArrayIterator stringIterator = new ArrayIterator(str);
			int countOfA = 0;
			int countOfE = 0;
			int countOfI = 0;
			int countOfO = 0;
			int countOfU = 0;
			
/*		    while (stringIterator.hasNext()){
		        char currentChar = (Character) stringIterator.next();
		        System.out.println("stringIterator.next() = " + currentChar);
*/		    
		    for(int i=0; i<str.length(); i++){
		    	System.out.println("Character at position '" + (i+1) + "' = '"+ str.charAt(i) + "'");
				switch (str.charAt(i)){
		        	case 'a':
		        	case 'A':
		        		countOfA++;
		        		break;
		        	case 'e':
		        	case 'E':
		        		countOfE++;
		        		break;
		        	case 'i':
		        	case 'I':
		        		countOfI++;
		        		break;
		        	case 'o':
		        	case 'O':
		        		countOfO++;
		        		break;
		        	case 'u':
		        	case 'U':
		        		countOfU++;
		        		break;
		        }
		    }
			System.out.println("count of 'A' = " + countOfA);
			System.out.println("count of 'E' = " + countOfE);
			System.out.println("count of 'I' = " + countOfI);
			System.out.println("count of 'O' = " + countOfO);
			System.out.println("count of 'U' = " + countOfU);
			totalNumberofVowels = countOfA + countOfE + countOfI + countOfO + countOfU;
			}
	    return totalNumberofVowels;
	}
	
	public static boolean isStringPalindrome(String str){
		boolean isPalindrome = true;
		String reversedString = "";
		if(null != str){
			int strLength = str.length();
			char[] reversedStringArray = new char[strLength];
			int lastPosition = strLength-1;
		    for(int i=lastPosition; i>=0; i--){
		    	reversedStringArray[i] = str.charAt(lastPosition - i);
		    }
			
		    for(int i=0; i<(strLength/2); i++){
		    	if(str.charAt(i) != str.charAt(strLength - 1 - i)){
		    		isPalindrome = false;
		    		//break; this is optional
		    	}
		    	reversedString = String.valueOf(reversedStringArray);
			}
		}
		System.out.println("Reverse of The String('" + str + "' is '" + reversedString + "'");
		System.out.println("String '" + str + "'  is " + 
				(isPalindrome ? "a" : "NOT a") + " Palindrome.");
	    return isPalindrome;
	}

	public static boolean compareStrings(String str1, String str2){
		boolean areEqual = false;
		
		System.out.println("String #1 is '" + str1);
		System.out.println("& String #2 is '" + str2);
		
		areEqual = str1 == str2;
		System.out.println("Using String == Operator, both strings are " 
				+ (areEqual ? "" : "NOT ") + "EQUAL.");

		if(str1.equals(str2)){
			System.out.println("Using String.equals() method, both strings are EQUAL.");
		}else{
			System.out.println("Using String.equals() method, both strings are NOT EQUAL.");
		}
		
			System.out.println("Using String.equalsIgnoreCase() method, both strings are " 
					+ ((str1.equalsIgnoreCase(str2)) ? "" : "NOT ") + "EQUAL.");

			System.out.println("Using String.contentEquals method, both strings are " 
					+ ((str1.contentEquals(str2)) ? "" : "NOT ") + "EQUAL.");

			return areEqual;
	}
	
	public static void printPermutationsOfString(String str){

		if(null != str){
	    	int strLength = str.length();
			System.out.println("Original String = ('" + str + "') is " + strLength + " Characters long");
	    	int numberOfIterations = 1;
	    	while(strLength > 0){
	    		numberOfIterations *= strLength--;
	    	}
	    	System.out.println("\tThere are " + numberOfIterations + " possble number of combinations/permutations as follows: \n");

	    	strLength = str.length();
			char[] permutedStringArray = new char[strLength];
			int permutedStringNum = 0;
			
	    	//Construct the Original String
	    	for(int pos=0; pos<strLength; pos++){
		    	permutedStringArray[pos] = str.charAt(pos);
	    	}
	    	
		    String permutedString = String.valueOf(permutedStringArray);
		    System.out.println("\t ORIGINAL String is: " + permutedString + "\n");
		    
	    	for(int i=0; i<strLength; i++){
		    	int firstElement = 0;
		    	
		    	while(firstElement < strLength-2){
		    		int leftIndex = firstElement;
			    	int rightIndex = leftIndex + 1;
			    	int savedFirstElement = firstElement;
			    	// Swap the Elements...
			    	while(leftIndex < strLength-1){	
	/*		    			System.out.println("\t Permuted String j = " + j);
			    			System.out.println("\t Permuted String k = " + k);
			    			System.out.println("\t Permuted String swapIndex = " + swapIndex);
	*/
		    			char tempChar = permutedStringArray[rightIndex];
				    	permutedStringArray[rightIndex] = permutedStringArray[leftIndex];
				    	permutedStringArray[leftIndex] = tempChar;
						
					    //permutedString = String.valueOf(permutedStringArray);
					    System.out.println(" First Element #" + firstElement + " Left Index #" + leftIndex + ": Right Index #" + rightIndex);
					    System.out.println("\t Permuted String #" + ++permutedStringNum + ": " + String.valueOf(permutedStringArray));
					    leftIndex++;
					    rightIndex++;
					    if(leftIndex == strLength-1){
					    	firstElement++;
					    	leftIndex = firstElement;
					    	rightIndex = leftIndex + 1;
					    }
		    		} // end while(leftIndex < strLength-1)...
			    	break;
	    		} // end while(firstElement < strLength-2)...
		    	
		    } // for(int i=0...
	    } // if(null != str)...
	} // end 

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SujitsStringAssignments.checkForDuplicateChars("Sujit Desai");
		//SujitsStringAssignments.reverseTheString("Sujit Desai");
		//SujitsStringAssignments.numberOfVowels("Sujit Desai");
		//SujitsStringAssignments.isStringPalindrome("TargetegraT");
		//SujitsStringAssignments.isStringPalindrome("Sujit Desai");
		//isStringPalindrome("X?");
		//String myName = "Sujit";
//		compareStrings("Sujit", "sujit");
		//compareStrings("Sujit", myName);
		
		printPermutationsOfString("ABCDE");
	}

}
