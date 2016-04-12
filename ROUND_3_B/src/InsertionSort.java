
public class InsertionSort extends Sort {

	public int[] sort(int[] input) {
		for (int i = 0; i < input.length - 1; i++) {
			for(int j = i+1;j > 0;j--){
				if(input[j] < input[j-1]){
					swap(input, j, j-1);
				}
			}
		}
		return input;
	}

}


