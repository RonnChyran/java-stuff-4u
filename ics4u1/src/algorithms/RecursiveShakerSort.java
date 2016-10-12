package algorithms;

public class RecursiveShakerSort<E extends Comparable<? super E>> implements SortingAlgorithm<E>{

	@Override
	public void sort(E[] array) {
		this.shakerSort(array, 0, true);
	}
	
	private void shakerSort(E[] array, int index, boolean swapped)
	{
		if(!swapped) return;
		swapped = false;
		for(int j = 0; j < array.length - index - 1; j++)
		{
			if(array[j].compareTo(array[j + 1]) > 0){
				this.swap(array, j, j + 1);
				swapped = true;
			}
		}
		for(int j = 0; j < array.length - index - 1; j++)
		{
			if(array[array.length - j - 1].compareTo(array[array.length - j - 2]) < 0){
				this.swap(array, array.length - j - 1, array.length - j - 2);
				swapped = true;
			}
		}
		this.shakerSort(array, ++index, swapped);
		
	}
	private void swap(E[] array, int indexA, int indexB) {
		E temp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = temp;
	}
	
}