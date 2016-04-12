import static org.junit.Assert.*;

import org.junit.Test;


public class SorterTests {

	@Test
	public void bubblesortPutsArrayInAscendingOrder() {
		int[] array = {3,1,2};
		array = new Sorter().sort(new BubbleSort(), array);
		assertArrayEquals(new int[]{1,2,3}, array );
	}
	
	@Test
	public void quicksortPutsArrayInAscendingOrder() {
		int[] array = {3,1,2};
		array = new Sorter().sort(new QuickSort(), array);
		assertArrayEquals(new int[]{1,2,3}, array );
	}
	
	@Test
	public void insertionsortPutsArrayInAscendingOrder() {
		int[] array = {3,1,2};
		array = new Sorter().sort(new InsertionSort(), array);
		assertArrayEquals(new int[]{1,2,3}, array );
	}

}
