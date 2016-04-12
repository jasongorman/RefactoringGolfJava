
public class QuickSort extends Sort {

	public int[] sort(int[] input) {
		return quicksort(input, 0, input.length - 1);
	}

	int partition(int[] array, int left, int right) {
		int i = left, j = right;
		int pivot = array[(left + right) / 2]; 	
		i = pivotElements(array, i, j, pivot); 	 
		return i; 

	}

	private int pivotElements(int[] array, int i, int j, int pivot) {
		while (i <= j) { 
			while (array[i] < pivot) 
				i++; 
			while (array[j] > pivot) 
				j--; 
			if (i <= j) { 
				swap(array, i, j);
				i++;
				j--;
			} 
		};
		return i;
	}

	private int[] quicksort(int[] input, int left, int right) {
		int index = partition(input, left, right);
		sortLeft(input, left, index);
		sortRight(input, right, index);
		return input;
	}


	private void sortRight(int[] input, int right, int index) {
		if (index < right){
			quicksort(input, index, right);
		}
	}

	private void sortLeft(int[] input, int left, int index) {
		if (left < index - 1){
			quicksort(input, left, index - 1);
		}
	}
}


