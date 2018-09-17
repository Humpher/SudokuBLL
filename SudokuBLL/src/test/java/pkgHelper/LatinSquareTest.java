package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class LatinSquareTest {//All the methods created in this class are implemented to test for the validity of the methods 
							 //in the actual LatinSquare class.
	
	@Test
	public void getLattinSquare() {
		
		int [][] arr = {{1,2,3}, {1,2,3}, {1,2,3}};   
		
		LatinSquare lq = new LatinSquare(arr);
		
		assertTrue(arr == lq.getLatinSquare());
			
	}
	
	@Test
	public void setLattinSquare() {
		
		int [][] arr = {{1,2,3}, {1,2,3}, {1,2,3}};
		
		LatinSquare lq = new LatinSquare(arr);
		
		
		assertTrue(lq.getLatinSquare() != null);
			
	}
	
	
	

	@Test
	public void hasDuplicates_test1() {
		
		int [] arr = {1,2,3,4,5};
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
		
		
	}
	
	
	@Test
	public void hasDuplicates_test2() {
		
		int [] arr = {1,1,3,4,5};
		
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
		
		
	}
	
	
	@Test
	public void hasDuplicates_test3() {
		
		int [] arr = {1,3,4,5,1};
		
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
		
		
	}
	
	@Test
	public void hasDuplicates_test4() {
		
		int [] arr = null;
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
		
		
	}
	
	@Test
	
	public void doesElementExist_Test1() {
		int [] arr = {1,2,3,4,5};
		int iValue=3;
		
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.doesElementExist(arr, iValue));
		
	}
	
	@Test
	public void doesElementExist_Test2() {
		int [] arr = {1,2,3,4,5};
		int iValue = 99;
		
		LatinSquare lq = new LatinSquare();
		assertFalse(lq.doesElementExist(arr, iValue));
		
		
	}
	
	@Test
	public void doesElementExist_Test3() {
		int [] arr = null;
		int iValue = 1;
		
		LatinSquare lq = new LatinSquare();
		assertFalse(lq.doesElementExist(arr, iValue));
		
		
	}
	
	
	@Test
	
	public void  hasAllValues_Test1() {
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = {1,2,3,4,5};
		
		LatinSquare lt = new LatinSquare();
		boolean c = lt.hasAllValues(arr1,arr2);
		
		
		assertEquals(c, true);
	
		
	}
	
	@Test
	
	public void  hasAllValues_Test2() {
		int [] arr3 = {1,2,3};
		int [] arr4 = {10, 12, 13};
		
		LatinSquare lt = new LatinSquare();
		boolean b = lt.hasAllValues(arr3,arr4);
		
		assertEquals(b, false);
	
		
	}
	
	
	@Test
	public void  ContainsZero_Test1() {
		int [][] arr1 = {{0,2,3}, {4,5,6}, {3,2,1}};
		
		LatinSquare lt = new LatinSquare(arr1);
		
		assertTrue(lt.ContainsZero());
		
	}
	
	@Test
	public void  ContainsZero_Test2() {
		int [][] arr1 = {{1,2,3}, {4,5,6}, {3,2,1}};
		
		LatinSquare lt = new LatinSquare(arr1);
		
		assertFalse(lt.ContainsZero());
		
	}
	
	@Test
	public void  getColumn() {
		int [] [] arr1 = {{1,2,3}, {1,2,3}, {3,5,6}};
		
		LatinSquare lt = new LatinSquare(arr1);
		
		int[] var = lt.getColumn(2);
		
		System.out.println(Arrays.toString(var));
		
	}
	
	@Test
	public void  getRow() {
		int [] [] arrZ = {{1,2,3}, {1,2,3}, {7,96,10}};
		
		LatinSquare lt = new LatinSquare(arrZ);
		
		int[] varz = lt.getRow(2);
		
		System.out.println(Arrays.toString(varz));
	}
	
	@Test
	public void  isLatinSquare_Test1() {
		int [] [] arrZ = {{1,2,3}, {3,1,2}, {2,3,1}};
		
		LatinSquare lt = new LatinSquare(arrZ);
		
		
				
		assertTrue(lt.isLatinSquare());
	}
	
	@Test
	public void  isLatinSquare_Test2() {
		int [] [] arrZ = {{1,6,3}, {1,7,3}, {1,2,3}};
		
		LatinSquare lt = new LatinSquare(arrZ);
		
		
				
		assertFalse(lt.isLatinSquare());
	}
	
	
	
}
