import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonacciIndexer {

	public int findIndexOf(long fibonacci) {
		if(fibonacci >= 0 && fibonacci < 2){
			return (int)fibonacci;
		}
		return seek(fibonacci);
	}

	private int seek(long fibonacci) {
		int indexOfFibonacci = -1;
		int currentIndex = 2;
		long f = 0;
		List<Long> sequence = buildInitialSequence();
		while(f < fibonacci){
			f = sequence.get(currentIndex - 1) + sequence.get(currentIndex - 2);
			if(f == fibonacci)
				return currentIndex;
			sequence.add(f);
			currentIndex++;
		}
		return indexOfFibonacci;
	}

	private List<Long> buildInitialSequence() {
		List<Long> sequence = new ArrayList<Long>();
		sequence.addAll(Arrays.asList(new Long[]{0L,1L}));
		return sequence;
	}

}