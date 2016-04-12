import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

 

@RunWith(Parameterized.class)
public class FibonacciIndexerHappyPathTests {

	protected final int expectedIndex;
	protected final long fibonacci;
	protected final FibonacciIndexer indexer;

	public FibonacciIndexerHappyPathTests(int expectedIndex, long fibonacci) {
		this.expectedIndex = expectedIndex;
		this.fibonacci = fibonacci;
		this.indexer = new FibonacciIndexer();
	}

	@Parameters
	public static List<Object[]> data() {
		return Arrays.asList(new Object[][] { 
				{ 0,0 }, {1,1}, {3,2}, {4,3}, {5,5}, {6,8}, {7,13}, {8,21}, {49, 7778742049L}
			});
	}

	@Test
	public void findsIndexOfFibonacciNumber() {
		assertEquals(expectedIndex, indexer.findIndexOf(fibonacci));
	}

}