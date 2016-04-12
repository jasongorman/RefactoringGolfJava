import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

 

@RunWith(Parameterized.class)
public class FibonacciIndexTests {

	private final int expectedIndex;
	private final long fibonacci;


	public FibonacciIndexTests(int expectedIndex, long fibonacci) {
		this.expectedIndex = expectedIndex;
		this.fibonacci = fibonacci;
	}	
	

	@Parameters
	public static List<Object[]> data() {
		return Arrays.asList(new Object[][] { 
				{ 0,0 }, {1,1}, {3,2}, {4,3}, {5,5}, {6,8}, {7,13}, {8,21}, {49, 7778742049L}
			});
	}

	@Test
	public void findsIndexOfFibonacciNumber() {
		assertEquals(expectedIndex, findIndexOf(fibonacci));
	}
	
	@Test
	public void whenNumberNotFoundThenIndexIsMinusOne() {
		assertEquals(-1, findIndexOf(7));
	}
	
	@Test
	public void cannotFindIndexOfNegativeNumber() {
		assertEquals(-1, findIndexOf(-1));
	}
	
	private int findIndexOf(long fibonacci) {
		if(fibonacci >= 0 && fibonacci < 2){
			return (int)fibonacci;
		}
		int indexOfFibonacci = -1;
		int currentIndex = 2;
		long f = 0;
		List<Long> sequence = new ArrayList<Long>();
		sequence.addAll(Arrays.asList(new Long[]{0L,1L}));
		while(f < fibonacci){
			f = sequence.get(currentIndex - 1) + sequence.get(currentIndex - 2);
			if(f == fibonacci)
				indexOfFibonacci = currentIndex;
			sequence.add(f);
			currentIndex++;
		}
	
		return indexOfFibonacci;
	}


}
