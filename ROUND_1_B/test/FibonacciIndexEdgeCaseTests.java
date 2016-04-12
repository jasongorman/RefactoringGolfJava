import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

 
public class FibonacciIndexEdgeCaseTests {

	@Test
	public void whenNumberNotFoundThenIndexIsMinusOne() {
		assertEquals(-1, new FibonacciIndexer().findIndexOf(7));
	}
	
	@Test
	public void cannotFindIndexOfNegativeNumber() {
		assertEquals(-1, new FibonacciIndexer().findIndexOf(-1));
	}


}
