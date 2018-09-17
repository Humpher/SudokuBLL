package pkgHelper;


import java.util.Arrays;

public class LatinSquare {

	private int[][] LatinSquare; 

	public LatinSquare() {

	}

	public LatinSquare(int[][] latinSquare) { //TODO : Initializes the private instant variable with the passed in values (arrays)
		super();
		LatinSquare = latinSquare;
	}

	public int[][] getLatinSquare() {
		return LatinSquare;
	}

	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}

	public boolean hasDuplicates(int[] arr) { //TODO: Returns true if there are any duplicates in the one dimensional array.

		boolean hasDuplicates = false;

		if (arr == null) {
			return false;
		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] == arr[i + 1]) {

				hasDuplicates = true;
				break;
			}
		}
		return hasDuplicates;
	}

	public boolean doesElementExist(int[] arr, int iValue) {//TODO:  Check to see and returns true if values passed in exists within one dimensional 

		boolean doesElementExist = false;
		if (arr == null) {
			return false;

		}
		for (int i : arr) {
			if (i == iValue) {
				doesElementExist = true;
				break;
			}
		}

		return doesElementExist;

	}

public boolean hasAllValues(int[] arr1, int[] arr2) {// TODO: Compares the values in two arrays and returns true if one array has the all values of the other. 
		
		boolean hasAllValues = true;

		for (int j = 0; j < arr2.length; j++) {
			
			boolean flag1 = false;

			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] == arr2[j]) {
					
					flag1 = true;
					break;

				}

			}
			
		if (flag1 == false) {
			hasAllValues = false;
			break;
			}
		}
		return hasAllValues;
		
	}


	public int[] getColumn(int iCol) { // Returns the specific indexed column of the array

		int[] returner = new int[this.LatinSquare.length];

		for (int row = 0; row <this.LatinSquare.length; row++) {
			
			returner[row] = LatinSquare[row][iCol];

		}

		return returner;

	}
	
	public int[] getRow(int iRow) {// Returns the specific indexed row of the array
		
		int [] Row = new int [this.LatinSquare.length];
		
		for (int col = 0; col<this.LatinSquare.length; col++) {
			
			Row [col] = LatinSquare[iRow][col];
		}
		return Row;
	}
	

	public boolean ContainsZero() { // Returns true if any element of the array is zero 
		
		
		for (int iCol = 0; iCol < LatinSquare.length; iCol++) {

			for (int iRow = 0; iRow < LatinSquare.length; iRow++) {
				
				if (LatinSquare[iCol][iRow] == 0) {
					
					return true;
					
				}
			}
		}
		
		return false;
		

	}
	
	public boolean isLatinSquare() {// Calls the required methods to test if the array is a LatinSquare
		
		boolean isLatinSquare = false;
		
		for(int row = 0; row<LatinSquare.length; row++) {
			if(hasDuplicates(getRow(row))){
				isLatinSquare= false;
			}
		}
		
		for(int col = 0; col<LatinSquare.length; col++) {
			if(hasDuplicates(getColumn(col))){// An example of calling a method to check any duplicates within a column
				isLatinSquare= false;
			}
		}
		
		for(int row = 1; row<LatinSquare.length; row++) {
			if(hasAllValues(getRow(0),getRow(row))){
				isLatinSquare= true;
			}
		}
		
		
		for(int col = 1; col<LatinSquare.length; col++) {
			if(hasAllValues(getColumn(0),getColumn(col))){
				isLatinSquare= true;
			}
		}
		
		return isLatinSquare;
		
	}
	
	
}
