package algorithms;

public class Quicksort<E extends Comparable<? super E>> implements SortingAlgorithm<E> {
	
	private void swap(E[] array, int indexA, int indexB) {
		E temp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = temp;
	}
	
	private int partition(E[] array, int left, int right){
		E pivot = array[(left + right) / 2];
		int i = left;
		int j = right;
		
		while(i <= j)
		{
			while (array[i].compareTo(pivot) < 0) {
				i++;
			}
			while (array[j].compareTo(pivot) > 0) {
				j--;
			}
			
			if (i <= j) {
	            this.swap(array, i, j);
	            i++;
	            j--;
			}	
		}
		return i;
	}
	
	private void quicksort(E[] array, int left, int right){
		int index;
		if(array.length <= 1) return;
		index = partition(array, left, right);
		if(left < index - 1) {
			this.quicksort(array, left, index - 1);
		}
		
		if(index < right) {
			this.quicksort(array, index, right);
		}
	}

	@Override
	public void sort(E[] array) {
		this.quicksort(array, 0, array.length - 1);
	}


}
